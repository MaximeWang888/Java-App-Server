package persistance;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

// Injection de d�pendances des classes au moment de l'ouverture de tomcat
public class InitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        try {
            Class.forName("persistance.MediathequeData");
//            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}