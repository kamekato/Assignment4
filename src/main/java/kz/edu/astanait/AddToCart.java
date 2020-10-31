package kz.edu.astanait;

import kz.edu.astanait.entities.Product;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

@WebServlet(name = "AddToCart", urlPatterns = "/AddToCart")
public class AddToCart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter("id"));
        LinkedList<Product> items = (LinkedList<Product>) session.getAttribute("items");
        AtomicReference<Product> selectedProduct=new AtomicReference<>();
        // lambda
        items.forEach(item->{
            if(id==item.getId()){ selectedProduct.set(item); }
        });
        for(Product item: items) {
            if (id == item.getId()) {
                selectedProduct.set(item);
            }
        }
        // Add to queue
        Queue<Product> cart;
        if (session.getAttribute("cart") != null) {
            cart = (Queue<Product>) session.getAttribute("cart");
        }
        else{
            cart=new LinkedList<>();
        }
        cart.add(selectedProduct.get());
        session.setAttribute("cart",cart);

        response.sendRedirect("Login.jsp");
    }
}
