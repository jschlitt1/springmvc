<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: charg
  Date: 2/25/2020
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h3>Registration Confirmed</h3>
The student is confirmed: ${bindingStudent.firstName} ${bindingStudent.lastName}
</body>
</html>
