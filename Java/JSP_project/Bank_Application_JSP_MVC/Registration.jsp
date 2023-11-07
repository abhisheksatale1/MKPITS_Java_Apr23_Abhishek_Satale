<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/4/2023
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<form action="Controller/RegistrationJSP.jsp" method="post">
    <div align="center">
        <h1>Registration Form </h1>
        <input type="text" name="Userid" placeholder="Enter The UserId"><br>
        <input type="text" name="UserPassword" placeholder="Enter The Password"><br>
        <input type="text" name="Username" placeholder="Enter The UserName"><br>
        <input type="text" name="UserAddress" placeholder="Enter The UserAddress"><br>
        <input type="text" name="UserCity" placeholder="Enter The UserCity"><br>
        <input type="number" name="UserBalance" placeholder="Enter The UserBalance"><br>
        <input type="submit" value="submit">

    </div>

</form>
<h3>Already Login<a href="index.jsp">Login page</a></h3>
</body>
</html>
