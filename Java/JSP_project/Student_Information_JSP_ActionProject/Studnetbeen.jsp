<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/3/2023
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:useBean id="studnet" class="com.example.studentinformationjspactionproject.model.Studentdetails" scope="application"/>

    <jsp:setProperty name="studnetdetails" property="rollNo" param="rollno"/>
<jsp:setProperty name="studnetdetails" property="name" param="name"/>
<jsp:setProperty name="studnetdetails" property="address" param="address"/>
<jsp:setProperty name="studnetdetails" property="city" param="city"/>

<table>
    <tr>
<td>Roll No:</td><td><jsp:getProperty name="studnetdetails" property="rollNo" /></td>
        <tr>
    <td>Name: </td><td><jsp:getProperty name="studnetdetails" property="name" /></td>
        </tr>
        <tr>
        <td>Address</td><td><jsp:getProperty name="studnetdetails" property="address" /></td>
        </tr>
    <tr>
        <td>City:</td><td><jsp:getProperty name="studnetdetails" property="city" /></td>
    </tr>
</table>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
