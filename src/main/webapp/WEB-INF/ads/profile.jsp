<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<% if (session.getAttribute("user") == null) {
    response.sendRedirect("login.jsp");
    return;
} %>

    <jsp:include page="../../partials/navbar.jsp" />

    <div class="container">

        <% String username = (String) session.getAttribute("user"); %>
        <h1>Welcome <%= username %>!</h1>



    </div>

</body>
</html>
