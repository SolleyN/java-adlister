<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form method="POST" action="/pizza-order.jsp">
    <label for="crust_type">Crust Type:</label>
    <select id="crust_type" name="crust_type">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="DeepCrust">Deep Crust</option>
        <option value="stuffed">Stuffed</option>
    </select>
    <br><br>
    <label onformdata="toppings">Toppings:</label>
    <br>
    <input type="checkbox" id="pepperoni" name="topping" value="pepperoni">
    <label for="pepperoni">Pepperoni</label>
    <br>
    <input type="checkbox" id="sausage" name="topping" value="sausage">
    <label for="sausage">Sausage</label>
    <br>
    <input type="checkbox" id="mushrooms" name="topping" value="mushrooms">
    <label for="mushrooms">Mushrooms</label>
    <br>
    <input type="checkbox" id="onions" name="topping" value="onions">
    <label for="onions">Onions</label>
    <br><br>
    <input type="submit" value="Submit Order">

