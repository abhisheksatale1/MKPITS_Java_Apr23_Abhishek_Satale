<%@ page import="com.example.bank_applicationjsp_mvc.Banking_Services.Bank_Service" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.mysql.cj.Session" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/6/2023
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="com.example.bank_applicationjsp_mvc.Model.Account_Details" scope="application"/>
<jsp:setProperty name="user" property="user_id" param="Userid"/>
<jsp:setProperty name="user" property="user_Password" param="Password"/>

<%
    String user_id= request.getParameter("Userid");
    session.setAttribute("user_id",user_id);


    Bank_Service bankService = new Bank_Service();
    ResultSet resultSet= bankService.checkRecord(user);
    if(resultSet.next()){
        out.println("Login successfully");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Display.html");
        requestDispatcher.forward(request, response);

    }
    else{
        out.println("Login is Not successfully");
    }
%>
<html>
<head>
    <title>Login JSP Page</title>
</head>
<body>
<%--    <a href="">Deposite</a>--%>
<%--    <a href="">Withdrawl</a>--%>
<%--    <a href="">Transfer</a>--%>
<%--    <a href="">Statement</a>--%>
<%--    <a href="">Logout</a>--%>
</body>
</html>
