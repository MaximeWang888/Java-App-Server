package services.abonne;

import mediatek2022.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Verif")
public class Verif extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        HttpSession session = request.getSession(true);

        out.println("<html>");

        out.println("<head>");
        String title = "Vérification de l'authentification";
        out.println("<title>" + title + "</title>");
        out.println("</head>");

        out.println("<body bgcolor=\"white\">");
// on récupère la variable session "user" et on l'affiche (sauf si null)
        Utilisateur user = (Utilisateur) session.getAttribute("user");
        if (user!=null)
            out.println("Utilisateur enregistré dans la variable session user " + user);
        else out.println("pas de variable session user");
        out.println("</body>");

        out.println("</html>");
    }

}
