<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/2/2023
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%

    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Abhi@123");
    System.out.println("Connection Established from database");
    String user_id= request.getParameter("userid");
    String password = request.getParameter("password");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from Account_Details where User_id=? and Password=?");
    preparedStatement.setString(1,user_id);
    preparedStatement.setString(2,password);
    ResultSet resultSet= preparedStatement.executeQuery();
    if(resultSet.next()){
       out.println("Welcom to Our Bank");
       HttpSession httpSession = request.getSession(true);
       httpSession.setAttribute("username",user_id);

    }
    else {
        out.println("incorrect usename or password");
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div width="200px" hight="200px">
        <h1>How can I Help You ? </h1>
        <a href="Withdrawl.jsp">Withdrawl</a>
        <a href="Deposite.jsp">Deposite</a>
        <a href="#">Transfer</a>
        <a href="#">Statement</a>
        <a href="#">Logout</a>

    </div>



</body>
</html>
