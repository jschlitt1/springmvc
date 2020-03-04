<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer page</title>
    <style>
        .error{
            font-size: smaller;
            color: darkred;
        }
    </style>
</head>
<body>
<h3>Claim your free tickets!!!</h3>
<form:form modelAttribute="theCustomer" action="orderTickets">
    First Name:
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br/><br/>
    Last Name:
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br/><br/>
    Free Passes:
    <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br/><br/>
    Postal Code:
    <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br/><br/>
    Event Code:
    <form:input path="eventCode"/>
    <form:errors path="eventCode" cssClass="error"/>
    <br/><br/>
    <input type="submit">
</form:form>
</body>
</html>
