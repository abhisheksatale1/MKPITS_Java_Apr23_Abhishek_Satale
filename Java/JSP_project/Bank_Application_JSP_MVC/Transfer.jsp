<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/8/2023
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transfer </title>
</head>
<body>
    <form method="post" action="Controller/TransferJSP.jsp">
        Enter Transfer User_id :<input name="User" type="text" placeholder="Enter the UserId"><br>
        Enter Transfer Amount: <input name="Amount" type="number" placeholder="Enter the Amount"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
