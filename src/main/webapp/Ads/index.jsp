<%--
  Created by IntelliJ IDEA.
  User: nickolassolley
  Date: 3/14/23
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Ads</h1>

<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Description</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ads}" var="ad">

            ${ad.title}
            ${ad.description}





    </c:forEach>


</body>
</html>



