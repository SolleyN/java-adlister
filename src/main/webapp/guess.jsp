<%--
  Created by IntelliJ IDEA.
  User: nickolassolley
  Date: 3/13/23
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Guessing Game</title>
</head>
<body>
<h1>Guess a number between 1 and 3:</h1>
<form method="POST" action="/guess">
  <input type="number" name="guess" min="1" max="3" required>
  <br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>
