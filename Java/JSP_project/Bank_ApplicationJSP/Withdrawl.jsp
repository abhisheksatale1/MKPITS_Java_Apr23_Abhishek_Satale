<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 6:22 PM
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
    <form action="Withdrawlconnection.jsp" method="post">
        <tr>
        <input type="number" placeholder="Enter the amount" name="amount">
        </tr>
        <tr>
            <input type="submit" value="Submit">
        </tr>
    </form>
</body>
</html>
