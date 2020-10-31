package kz.edu.astanait;

import kz.edu.astanait.entities.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name = "Confirmation", urlPatterns = "/Confirmation")
public class Confirmation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<String,Object> activities = new HashMap<>();
        activities.put("Session inactive interval", session.getMaxInactiveInterval());
        activities.put("Session creation time", new Date(session.getCreationTime()));
        activities.put("Session last accessed time", new Date(session.getLastAccessedTime()));
        AtomicInteger totalPrice = new AtomicInteger();
        List<Product> cart = (List<Product>) session.getAttribute("cart");
        cart.forEach(product-> totalPrice.addAndGet((int) product.getPrice()));
        activities.put("Total price", totalPrice);
        session.setAttribute("activities",activities);
        response.sendRedirect(getServletContext().getContextPath()+"/Confirmation.jsp");
    }
}
