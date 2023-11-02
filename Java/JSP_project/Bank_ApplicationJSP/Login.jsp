<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Abhi@123");
    System.out.println("Connection Established from database");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<form action="LoginConnection.jsp" method="post">

        <tr>
            <td><input type="text" name="userid" placeholder="Enter the User_id"></td>
        </tr>
        <tr>
            <td><input type="password" name="password" placeholder="Enter the Password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login"></td>
        </tr>
            <a href="RegistrationConnection.jsp">SignUp</a>


</form>
</table>

</body>
</html>
