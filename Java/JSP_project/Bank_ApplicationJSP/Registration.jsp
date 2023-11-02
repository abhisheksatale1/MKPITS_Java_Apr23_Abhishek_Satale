<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 2:59 PM
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
<form action="RegistrationConnection.jsp" method="post">
    <table border="1">
        <tr>
            <td><input type="text" name="customerid" placeholder="Enter the customer_id"></td><Br>
            <td><input type="password" name="password" placeholder="Enter the Password"></td><Br>
            <td><input type="text" name="Name" placeholder="Enter the Name"></td><Br>
            <td><input type="text" name="Address" placeholder="Enter the Address"></td><Br>
            <td><input type="text" name="city" placeholder="Enter the City"></td><Br>
            <td><input type="number" name="balance" placeholder="Enter the Balance"></td><Br>
            <td><input type="submit" value="Submit"></td><Br>
        </tr>
    </table>
</form>
</body>
</html>
