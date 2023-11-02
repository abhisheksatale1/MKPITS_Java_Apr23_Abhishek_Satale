<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
    String UserId= request.getParameter("customerid");
    String Password= request.getParameter("password");
    String Name= request.getParameter("Name");
    String Address= request.getParameter("Address");
    String City = request.getParameter("city");
    Double Balance=Double.parseDouble(request.getParameter("balance"));
    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Abhi@123");
    System.out.println("Connection Established from database");
    PreparedStatement preparedStatement= connection.prepareStatement("insert into Account_Details values (?,?,?,?,?,?) ");
    preparedStatement.setString(1,UserId);
    preparedStatement.setString(2,Password);
    preparedStatement.setString(3,Name);
    preparedStatement.setString(4,Address);
    preparedStatement.setString(5,City);
    preparedStatement.setDouble(6,Balance);
    int result= preparedStatement.executeUpdate();

%>


<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(result!=0)
    {
%>
    <h3>Record inserted</h3>
<%
    }
    else
    {
%>
    <h3>Record is not inserted</h3>
<%
    }
%>


</body>
</html>
