<%@ page import="com.example.studentinformationjspactionproject.service.Studentservice" %>
<%@ page import="com.example.studentinformationjspactionproject.model.Studentdetails" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/3/2023
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="studnet" class="com.example.studentinformationjspactionproject.model.Studentdetails" scope="application"/>

<jsp:setProperty name="studnet" property="rollNo" param="rollno"/>
<jsp:setProperty name="studnet" property="name" param="name"/>
<jsp:setProperty name="studnet" property="address" param="address"/>
<jsp:setProperty name="studnet" property="city" param="city"/>
<%
    Studentservice studentservice = new Studentservice();
    if (studentservice.insertRecord(studnet)!=0){
        out.println("inserted");
    }
    else {
       out.println("not Inserted");
    }
%>
<html>
<head>
    <title> </title>
</head>
<body>
    <a href="Studentrecorddisplay.jsp"> Display</a>
</body>
</html>
