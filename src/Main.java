import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/appserv", "root", "rootsql");

            Statement statement = connexion.createStatement();

            ResultSet resultSet = statement.executeQuery("select  * from user");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
