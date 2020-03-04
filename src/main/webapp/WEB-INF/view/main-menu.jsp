<%--
  Created by IntelliJ IDEA.
  User: charg
  Date: 2/18/2020
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Demo</title>
    <%-- Bootstrap stuff --%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<%= request.getContextPath()%>/controller?page=index">Class Demo</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="fin-aid/home">Financial Aid</a></li>
            <li><a href="registrar/home">Registrar Aid</a></li>
            <li><a href="showForm">Shout Page</a></li>
            <li><a href="Card/">Card Example</a></li>
            <li><a href="student/showForm">student form</a></li>
            <li><a href="travel/showForm">Exchange Student</a></li>
            <li><a href="validation/form">Customer Stuff</a></li>
        </ul>
    </div>
</nav>
    <br/>
    <img src="resources/img/mew.jpg" alt="smoll cat"/>
</body>
</html>
