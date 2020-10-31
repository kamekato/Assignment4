package kz.edu.astanait;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        // If username and password is incorrect
        if((uname.equals("Akan") && pass.equals("123Akan") || (uname.equals("Kamekato") && pass.equals("Kamekato")))){

            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("Login.jsp");
        }
        else{
            response.sendRedirect("index.jsp");
        }
    }
}
