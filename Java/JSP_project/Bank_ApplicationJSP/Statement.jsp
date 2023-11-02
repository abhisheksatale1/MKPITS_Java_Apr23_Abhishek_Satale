<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/3/2023
  Time: 12:33 AM
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
    <title>Statement</title>
</head>
<body>

</body>
</html>
