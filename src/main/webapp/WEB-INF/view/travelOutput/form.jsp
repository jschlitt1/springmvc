<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Exchange Student</title>
</head>
<body>
    <c:url value="/travel/processForm" var="actionUrl"/>
    <form:form action="${actionUrl}" modelAttribute="exchStudent">
        Home Country:
        <form:select path="homeCountry">
            <form:option value="BR" label="Brazil"/>
            <form:option value="FR" label="France"/>
            <form:option value="IN" label="India"/>
        </form:select>
        <br/>
        Host Country:
        <form:select path="hostCountry">
            <form:options items="${countries.map}"/>
        </form:select>
        <br/>
        <form:select path="gradeLevel">
            <form:options items="${gradeLevels}"></form:options>S
        </form:select>
        <br/>
        <form:radiobuttons path="travelMethod" items="${travelMethods}"></form:radiobuttons>
        <br/>
        <form:checkbox path="spokenLanguages" value="English" label="English"/>
        <form:checkbox path="spokenLanguages" value="Spanish" label="Spanish"/>
        <form:checkbox path="spokenLanguages" value="German" label="German"/>
        <form:checkbox path="spokenLanguages" value="Terkish" label="Terkish"/>

        <input type="submit">
    </form:form>
</body>
</html>
