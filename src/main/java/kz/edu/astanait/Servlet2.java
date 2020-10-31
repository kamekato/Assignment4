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


public class Servlet2 extends HttpServlet {

    public void redirectCategory(HttpServletRequest request, HttpServletResponse response, String page) throws IOException {
        LinkedList<Product> products = new LinkedList<>();

        if(page.equals("/sports")){
            Product sports1 = new Product(1, "BasketBall", "https://cdn11.bigcommerce.com/s-2sxhiat0li/images/stencil/1280x1280/products/182/588/GL7X_AD__99451.1461966775.jpg?c=2", 29000);

            Product sports2 = new Product(2, "FootBall", "https://images-na.ssl-images-amazon.com/images/I/71X33zJRxTL._SX425_.jpg", 20000);

            Product sports3 = new Product(3, "VolleyBall", "https://images-na.ssl-images-amazon.com/images/I/71kjs9OiBdL._AC_SL1150_.jpg", 22000);

            products.add(sports1);
            products.add(sports2);
            products.add(sports3);
        }

        else if(page.equals("/furniture")){
            Product furniture1 = new Product(4, "Sofa", "https://static-ru.insales.ru/images/collections/1/5396/1848596/Divany.JPG", 240000);

            Product furniture2 = new Product(5, "Armchair", "https://www.ikea.com/ru/ru/images/products/vattviken-kreslo-krovat-lerhaga-svetlo-seryy__0767121_PE753991_S5.JPG", 50000);

            Product furniture3 = new Product(6, "Cupboard", "https://zeta.kz/uploads/product_images/2992/59e4676a78fbe.jpg", 70000);

            products.add(furniture1);
            products.add(furniture2);
            products.add(furniture3);
        }
        else{
            Product gadgets1 = new Product(7, "iPhone 12", "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-12-pro-family-hero?wid=926&amp;hei=1112&amp;fmt=jpeg&amp;qlt=80&amp;op_usm=0.5,0.5&amp;.v=1602088412000", 600000);

            Product gadgets2 = new Product(8, "Samsung P20 Pro", "https://alfa.kz/files/alfa/messages/1/3/1/0/7/13107278-Samsung_Galaxy_S10_Plus_White-1.1552884097861_601988.jpg", 320000);

            Product gadgets3 = new Product(9, "Huawei P40 Pro", "https://www.mechta.kz/export/1cbitrix/import_files/aa/aa1199a6-7a40-11ea-a22d-005056b6dbd7.jpeg", 129000);

           products.add(gadgets1);
           products.add(gadgets2);
           products.add(gadgets3);
        }

        HttpSession sessions = request.getSession();
        sessions.setAttribute("items", products);
        response.sendRedirect("Show.jsp");


    }

}
