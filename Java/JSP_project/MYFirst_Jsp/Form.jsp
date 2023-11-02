<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>

<%
    String rollNo = request.getParameter("roll");
    String name = request.getParameter("name");
    String pin = request.getParameter("address");
    String city = request.getParameter("city");

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loading");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseStudent","root","Abhi@123");
    System.out.println("Connection Established from database");

    PreparedStatement preparedStatement = connection.prepareStatement("insert into Students values(?,?,?,?) ");
    preparedStatement.setString(1,rollNo);
    preparedStatement.setString(2,name);
    preparedStatement.setString(3,pin);
    preparedStatement.setString(4,city);
    preparedStatement.executeUpdate();


%>



<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>