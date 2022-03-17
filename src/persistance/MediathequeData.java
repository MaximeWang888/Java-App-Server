package persistance;

import java.sql.*;
import java.util.List;
import mediatek2022.*;
import persistance.modele.utilisateur.Abonne;


// classe mono-instance  dont l'unique instance est connue de la médiatheque
// via une auto-déclaration dans son bloc static

public class MediathequeData implements PersistentMediatheque {
// Jean-François Brette 01/01/2018
	static {
		Mediatheque.getInstance().setData(new MediathequeData());
	}

	private MediathequeData() {
	}

	// renvoie la liste de tous les documents disponibles de la médiathèque
	@Override
	public List<Document> tousLesDocumentsDisponibles() {
		return null;
	}

	// va récupérer le User dans la BD et le renvoie
	// si pas trouvé, renvoie null
	@Override
	public Utilisateur getUser(String login, String password) {
		try {
			return getInDB(login, password);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	// va récupérer le document de numéro numDocument dans la BD
	// et le renvoie
	// si pas trouvé, renvoie null
	@Override
	public Document getDocument(int numDocument) {
		return null;
	}

	@Override
	public void ajoutDocument(int type, Object... args) {
		// args[0] -> le titre
		// args [1] --> l'auteur
		// etc... variable suivant le type de document
	}

	private Utilisateur getInDB(String login, String password) throws SQLException {

		Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/appserv", "root", "rootsql");

		String query = "SELECT * from utilisateur";

		PreparedStatement dynStatement = connexion.prepareStatement(query);

		ResultSet resultStatement = dynStatement.executeQuery();
		System.out.println("MEDIATHEQUE DATA");
		while (resultStatement.next()) {
			String rLogin = resultStatement.getString("login");
			String rPassword = resultStatement.getString("password");

			if (rLogin.equals(login) && rPassword.equals(password))
				return new Abonne(login, password);
		}

		return null;
	}

}
