<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form method="POST" action="/pizza-order">
    <label for="crust_type">Crust Type:</label>
    <select id="crust_type" name="crust_type">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="
