package kz.edu.astanait;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Furniture", urlPatterns = "/furniture")
public class Furniture extends Servlet2 {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            redirectCategory(request, response, "/furniture");
    }
}
