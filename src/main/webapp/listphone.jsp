<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<title>ASM 2</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<body>

<div class="w3-container">
    <h2>Basic Table </h2>
    <p>The w3-table class defines a basic table: </p>
    <div class="w3-container">
        <h2>W3.CSS Modal </h2>
        <a href="AddPhoneServlet">
            <h2>Add Phone</h2>
        </a>
    </div>
    <form method="post" id="formAction">
        <table class="w3-table w3-striped">
            <tr class="w3-green">
                <th>Id</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Description</th>
                <th>Action</th>
            </tr>
            <c:forEach var="phone" items="${requestScope.phones}">
                <tr>
                    <td>${phone.id}</td>
                    <td>${phone.name}</td>
                    <td>${phone.brand}</td>
                    <td>${phone.price}</td>
                    <td>${phone.description}</td>
                    <td>
                        <a href="">Edit</a>
                        <a href="">Delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </form>

</div>
</body>
</html>

