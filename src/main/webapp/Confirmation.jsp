<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: kamek
  Date: 20.10.2020
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <c:forEach var="activity" items="${sessionScope.activities}">
        <tr>
            <td>${activity.key}</td>
            <td>${activity.value}</td>
        </tr>
    </c:forEach>
</table>
<br><br><br>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Photo</th>
        <th>Price</th>
    </tr>
    <c:forEach var="product" items="${sessionScope.cart }">
        <tr>
            <td>${product.id }</td>
            <td>${product.name }</td>
            <td>
                <img src="${product.photo }" width="120">
            </td>
            <td>${product.price }</td>
        </tr>
    </c:forEach>
</table>
<br><br><br>
<form action="<c:url value = "/logout"/>">
    <input type="submit" value="Log Out">
</form>
</body>
</html>
