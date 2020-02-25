<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: charg
  Date: 2/18/2020
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Card Home</title>
</head>
<body>
<c:url value="/Card/process" var="work"/>
<form method="get" action="${work}">
    <label for="CardNum">Card Number</label>
    <input type="number" name="CardNum" id="CardNum">
    <br/>
    <label for="CardHolder">Name on Card:</label>
    <input type="text" name="CardHolder" id="CardHolder">
    <br/>
    <label for="ExpDate">Expiration Date</label>
    <input type="date" name="ExpDate" id="ExpDate">
    <br/>
    <label for="Security">Security Code</label>
    <input type="password" name="Security" id="Security">
    <br/>
    <input type="submit">
</form>
</body>
</html>
