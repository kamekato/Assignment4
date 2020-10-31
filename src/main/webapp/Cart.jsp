<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
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
<form action="Confirmation">
    <input type="submit" value="Confirm" name="Confirm">
</form>
</body>
</html>
