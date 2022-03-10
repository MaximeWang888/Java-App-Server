package persistance;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        try {
            Class.forName("persistance.MediathequeData");
            System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}