<%@ page import="java.util.Date" %>
<%@ page import="com.example.bank_applicationjsp_mvc.Banking_Services.Bank_Service" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/8/2023
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transfer" class="com.example.bank_applicationjsp_mvc.Model.User_Transactions" scope="application"/>
<%
    String Userid=session.getAttribute("user_id").toString();
    long value = session.getCreationTime();
    Date transaction_Date = new java.sql.Date(value);
    String transferIn= "Transfer In";
    String transferOut="Transfer Out";

%>
<%------ transfer in-----------------------------------%>
<jsp:setProperty name="transfer" property="transfer_userid" param="User"/>
<jsp:setProperty name="transfer" property="transaction_date" value="<%=transaction_Date%>"/>
<jsp:setProperty name="transfer" property="transaction_amount" param="Amount"/>
<jsp:setProperty name="transfer" property="transaction_type" value="<%=transferIn%>"/>

<%----------------transfer out---------------------------%>

<jsp:setProperty name="transfer" property="loginUser_id" value="<%=Userid%>"/>
<jsp:setProperty name="transfer" property="transaction_date" value="<%=transaction_Date%>"/>
<jsp:setProperty name="transfer" property="transaction_amount" param="Amount"/>
<jsp:setProperty name="transfer" property="transaction_type2" value="<%=transferOut%>"/>

<html>
<head>
    <title>TransferJSP</title>
</head>
<body>
<table>
    <td>loginUserId : <jsp:getProperty name="transfer" property="loginUser_id"/></td>
    <td>transfer :<jsp:getProperty name="transfer" property="transfer_userid"/></td>
</table>

<%


    Bank_Service bankService = new Bank_Service();
    if (bankService.TransferAmount(transfer)!=0){
        out.println("Balance Transferd");
    }
    else {
        out.println("Balance is not Transfered");
    }

%>


</body>
</html>
