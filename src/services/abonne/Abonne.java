package services.abonne;

import mediatek2022.Mediatheque;
import mediatek2022.Utilisateur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Abonne")
public class Abonne extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        HttpSession session = request.getSession(true);

        out.println("<html>");
        out.println("<head>");
        String title = "MEDIATHEQUE";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        out.println("Ce que vous aviez saisi en login : " + login + "<br/>");

        out.println("Ce que vous aviez saisi en mot de passe : " + password + "<br/>");


        try {
            // Connection entre S ET Métier
            Utilisateur user = Mediatheque.getInstance().getUser(login, password);
            out.println("Vous êtes connecté en tant que " + user.toString());
            session.setAttribute("user", user);
        } catch (Exception e) {
            out.println(e.getMessage());
        }

        out.println("</body>");
        out.println("</html>");

    }



}

