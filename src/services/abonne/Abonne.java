package services.abonne;

import mediatek2022.Mediatheque;
import mediatek2022.Utilisateur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

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

        out.println(login);
        out.println(password);


        try {
            out.println("\n");
            // Connection entre S ET Métier
            Utilisateur user = Mediatheque.getInstance().getUser(login, password);
            out.println(user.toString());
            session.setAttribute("user", user);
            out.println("\n");
        } catch (Exception e) {
            out.println(e.getMessage());
        }

        out.println("</body>");
        out.println("</html>");

    }



}

