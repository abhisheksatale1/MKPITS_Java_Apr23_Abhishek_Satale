<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.sql.*" %>
<%
    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Abhi@123");
    System.out.println("Connection Established from database");
    HttpSession httpSession = request.getSession(true);
   String userid= httpSession.getAttribute("username").toString();
    Date date = new Date(httpSession.getCreationTime());
    String amounttype = "Withdraw";
    Double amount= Double.parseDouble(request.getParameter("amount"));

    PreparedStatement preparedStatement = connection.prepareStatement("insert into Transactions values (?,?,?,?)");
    preparedStatement.setString(1,userid);
    preparedStatement.setDate(2,date);
    preparedStatement.setDouble(3,amount);
    preparedStatement.setString(4,amounttype);
    int result = preparedStatement.executeUpdate();
    if (result!=0){
        out.println("Amount Withdraw successfully");
    }
    else {
        out.println("Amount is not withdraw");
    }
    PreparedStatement preparedStatementupdate = connection.prepareStatement("update Account_Details set balance = balance-? where user_id=?");
    preparedStatementupdate.setString(2,userid);
    preparedStatementupdate.setDouble(1,amount);
    int resultupdate= preparedStatementupdate.executeUpdate();
    if (resultupdate!=0){
        out.println("Balance is Updated");
    }
    else {
        out.println("balance is not updated");
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Thank you</h1>
    <a href="LoginConnection.jsp">Login Page</a>
</body>
</html>
