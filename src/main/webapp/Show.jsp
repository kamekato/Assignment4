<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kamek
  Date: 18.10.2020
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.LinkedList" %>
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
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Photo</th>
        <th>Price</th>
        <th>Buy</th>
    </tr>
    <c:forEach var="product" items="${sessionScope.items}">
        <tr>
            <td>${product.id }</td>
            <td>${product.name }</td>
            <td>
                <img src="${product.photo }" width="200">
            </td>
            <td>${product.price }</td>
            <td align="center">
                <input type="hidden" value="${product.name }" name="${product.name }">
                <a href="${pageContext.request.contextPath }/AddToCart?&id=${product.id }">Add to cart</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="Cart.jsp">
    Shopping Cart
</a>
<br><br
<br><br><br>
<form action="logout">
    <input type="submit" value="Log Out">
</form>
</body>
</html>
