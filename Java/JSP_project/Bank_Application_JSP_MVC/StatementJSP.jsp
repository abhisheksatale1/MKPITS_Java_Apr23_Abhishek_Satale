<%@ page import="com.example.bank_applicationjsp_mvc.Banking_Services.Bank_Service" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/9/2023
  Time: 12:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transactions" class="com.example.bank_applicationjsp_mvc.Model.User_Transactions" scope="application"/>
<jsp:useBean id="details" class="com.example.bank_applicationjsp_mvc.Model.Account_Details" scope="application"/>
<%
    String Userid=session.getAttribute("user_id").toString();
%>
<jsp:setProperty name="transactions" property="loginUser_id" value="<%=Userid%>"/>
<jsp:setProperty name="details" property="user_id" value="<%=Userid%>"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Bank_Service bankingServices = new Bank_Service();
    ResultSet resultSet =bankingServices.balance_And_Statement(transactions);
%>
<h2><center><%="User Id : " + Userid%></center></h2>
<table border="1px" cellspacing="5px" cellpadding="5px" align="center">
    <tr>
        <th>Transaction Date</th>
        <th>Amount</th>
        <th>Transaction Type</th>
    </tr>
    <%
        while (resultSet.next())
        {
    %>
    <tr>
        <td><%=resultSet.getDate(1)%></td>
        <td><%=resultSet.getDouble(2)%></td>
        <td><%=resultSet.getString(3)%></td>
    </tr>
    <%
        }
    %>
</table>
<%--//------------------------ total balance--------------------------------------------%>
<%
    ResultSet resultSet1=bankingServices.totalBalance(details);
    while (resultSet1.next())
    {
%>
<h2><center><%="Balance : " + resultSet1.getDouble(1)%></center></h2>
<%
    }
%>
</body>
</html>




