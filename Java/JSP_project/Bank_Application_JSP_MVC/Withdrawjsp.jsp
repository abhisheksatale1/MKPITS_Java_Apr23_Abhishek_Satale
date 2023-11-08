<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bank_applicationjsp_mvc.Banking_Services.Bank_Service" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/7/2023
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="withdraw" class="com.example.bank_applicationjsp_mvc.Model.User_Transactions" scope="application"/>
<%
    String Userid=session.getAttribute("user_id").toString();
    long value = session.getCreationTime();
    Date transationdate = new Date(value);
    String Transaction_type= "withdraw";

%>
<jsp:setProperty name="withdraw" property="transfer_userid" value="<%=Userid%>"/>
<jsp:setProperty name="withdraw" property="transaction_date" value="<%=transationdate%>"/>
<jsp:setProperty name="withdraw" property="transaction_amount" param="amount"/>
<jsp:setProperty name="withdraw" property="transaction_type" value="<%=Transaction_type%>"/>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Bank_Service bankService = new Bank_Service();

    if (bankService.WithdrawBalance(withdraw)!=0){
        out.println("Balance is Withdraw in Account");
    }
    else {
        out.println("Balance is not Withdraw in Account");
    }

%>


</body>
</html>
