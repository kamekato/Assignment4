<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kamek
  Date: 18.10.2020
  Time: 03:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if(session.getAttribute("username")==null){
            response.sendRedirect("index.jsp");
        }
    %>

    <h1>Welcome ${username}!</h1><br><br>


    <form action="<c:url value = "/sport"/>">
        <h3>Click if you want to go to the sports category</h3>
        <input type="submit" value="Click Sport">
    </form>

    <form action="<c:url value = "/furniture"/>">
        <h3>Click if you want to go to the furniture category</h3>
        <input type="submit" value="Click Furniture">
    </form>

    <form action="<c:url value = "/gadgets"/>">
        <h3>Click if you want to go to the gadgets category</h3>
        <input type="submit" value="Click Gadgets">
    </form>
    <br><br><br>
    <a href="Cart.jsp">
        Shopping Cart
    </a>
    <br><br><br><br>
    <form action="<c:url value = "/logout"/>">
        <input type="submit" value="Log Out">
    </form>
</body>
</html>
