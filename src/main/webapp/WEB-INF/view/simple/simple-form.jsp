<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: charg
  Date: 2/18/2020
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A Simple Form</title>
</head>
<body>
    <h2>Be Shouted At</h2>
    <c:url value="/shout" var="actionUrl"/>
<form method="get" action="${actionUrl}">
    <input type="text" name="studentName" placeholder="Student Name">
    <br/>
    <input type="submit">
</form>

    <h2>Be Shouted At Again</h2>
    <c:url value="/shoutAgain" var="actionUrl2"/>

    <form method="get" action="${actionUrl2}">
        <input type="text" name="studentName" placeholder="Student Name">
        <br/>
        <input type="submit">
    </form>
</body>
</html>
