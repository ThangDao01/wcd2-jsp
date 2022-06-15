<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<style>
    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=submit] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type=reset] {
        width: 100%;
        background-color: yellow;
        color: black;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #45a049;
    }
    input[type=reset]:hover {
        background-color: yellow;
    }

    div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
    }
</style>
<body>

<h3>Add Phone Form</h3>

<div>
    <form action="AddPhoneServlet" method="post">
        <label for="fname">Phone Name</label>
        <input type="text" id="fname" name="name" placeholder="Phone name.." required>

        <label for="price">Price</label>
        <input type="text" id="price" name="price" placeholder="Price" required>

        <label for="brand">Brand</label>
        <select id="brand" name="brand">
            <option value="" disabled>--Brand--</option>
            <option value="Apple">Apple</option>
            <option value="Samsung">Samsung</option>
            <option value="Nokia">Nokia</option>
            <option value="Others">Others</option>
        </select>

        <label for="description">Description</label>
        <input type="text" id="description" name="description" placeholder="Description" required>

        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>
</div>

</body>
</html>


