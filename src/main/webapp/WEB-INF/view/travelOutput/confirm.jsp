<%--
  Created by IntelliJ IDEA.
  User: charg
  Date: 2/25/2020
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    Home Country: ${exchStudent.homeCountry}
    <br/>
    Host Country: ${exchStudent.hostCountry}
    <br/>
    Travel Method: ${exchStudent.travelMethod}
    <br/>
    Grade level: ${exchStudent.gradeLevel}
    <br/>
    <ul>
<c:foreach items="${exchStudent.spokenLanguages}" var="lan">
    <li>${lan}</li>
</c:foreach>
    </ul>
</body>
</html>


