<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm page</title>
</head>
<body>
Thank you, ${theCustomer.firstName} ${theCustomer.lastName}
<br/>
You have reserved ${theCustomer.freePasses} passes to ${theCustomer.eventCode}
<br/>
You live in the postal code of ${theCustomer.postalCode}
</body>
</html>
