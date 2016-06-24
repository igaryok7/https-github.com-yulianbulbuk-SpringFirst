<%--
  Created by IntelliJ IDEA.
  User: Yulian Bulbuk
  Date: 24.06.2016
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Authors here!</h2>
<table>
    <thead>
    <tr>
    <td>Name</td>
    <td>Country</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${authors}" var="author">
        <tr>
        <td>${author.name}</td>
        <td>${author.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="authorNew">New Author</a>
</body>
</html>
