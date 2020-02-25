<%--
  Created by IntelliJ IDEA.
  User: charg
  Date: 2/18/2020
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    <p>The information you entered in the card form is as follows</p>

    <table>
        <tr>
            <th>Number:</th>
            <td>${CardNum}</td>
        </tr>
        <tr>
            <th>Security Code:</th>
            <td>${Security}</td>
        </tr>
        <tr>
            <th>Expiration:</th>
            <td>${ExpDate}</td>
        </tr>
        <tr>
            <th>Name:</th>
            <td>${CardHolder}</td>
        </tr>
    </table>
</body>
</html>
