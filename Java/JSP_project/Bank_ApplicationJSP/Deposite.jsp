<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 11:41 PM
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
    <title>Deposite page</title>
</head>
<body>
<form action="Depoisteconnection.jsp" method="post">
    <tr>
        <input type="number" placeholder="Enter the amount that you have deposited" name="amount">
    </tr>
    <tr>
        <input type="submit" value="Deposited">
    </tr>
</form>
</body>
</html>
