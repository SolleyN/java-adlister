<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
</head>
<body>
<form method="post" action="login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br>
    <input type="submit" value="Login">
</form>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null && username.equals("admin") && password != null && password.equals("password")) {
        response.sendRedirect("profile.jsp");
    } else if (username != null || password != null) {
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>
