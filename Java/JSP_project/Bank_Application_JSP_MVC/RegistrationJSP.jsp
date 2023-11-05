<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/4/2023
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="com.example.bank_applicationjsp_mvc.Model.Account_Details" scope="application"/>

<jsp:setProperty name="user" property="user_id" param="Userid"/>
<jsp:setProperty name="user" property="user_Password" param="UserPassword"/>
<jsp:setProperty name="user" property="user_name" param="Username"/>
<jsp:setProperty name="user" property="user_Address" param="UserAddress"/>
<jsp:setProperty name="user" property="user_City" param="Usercity"/>
<jsp:setProperty name="user" property="user_Balance" param="UserBalance"/>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
