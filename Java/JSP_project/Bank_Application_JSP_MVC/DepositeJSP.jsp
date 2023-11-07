<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bank_applicationjsp_mvc.Banking_Services.Bank_Service" %>
<%@ page import="com.example.bank_applicationjsp_mvc.Model.User_Transactions" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/6/2023
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="users" class="com.example.bank_applicationjsp_mvc.Model.User_Transactions" scope="application"/>
<%

    String Userid=session.getAttribute("user_id").toString();
    long value = session.getCreationTime();
    Date transaction_Date = new java.sql.Date(value);


    String Transation_type= "Deposit";
%>
<jsp:setProperty name="users" property="loginUser_id" value="<%=Userid%>" />
<jsp:setProperty name="users" property="transaction_date" value="<%=transaction_Date%>"/>
<jsp:setProperty name="users" property="transaction_amount" param="amount"/>
<jsp:setProperty name="users" property="transaction_type" value="<%=Transation_type%>"/>
<%
    Bank_Service bankService = new Bank_Service();
   bankService.depositAmount(users);
   if(bankService.depositAmount(users)!=0){
       System.out.println("Balance is Deposited in Account");
   }
   else {
       System.out.println("Balance is Not Deposited in Account");
   }

%>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
