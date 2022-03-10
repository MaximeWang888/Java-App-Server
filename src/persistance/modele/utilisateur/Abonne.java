package persistance.modele.utilisateur;

public class Abonne extends AUtilisateur {

    private String login;
    private String password;

    public Abonne(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Abonne{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean isBibliothecaire() {
        return false;
    }

    @Override
    public Object[] data() {
        return new Object[0];
    }
}
