<%@ page import="com.example.studentinformationjspactionproject.service.Studentservice" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 11/3/2023
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="studnet" class="com.example.studentinformationjspactionproject.model.Studentdetails" scope="application"/>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Studentservice studentservice = new Studentservice();
   ResultSet resultSet= studentservice.Displayrecord();
    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

    while (resultSet.next()){
        System.out.println("record display");
       %>
<table border="1px" align="center" margin="10px" cellpadding="10px">
    <tr>
    <td>
        <%=
            resultSet.getString(1)
        %>
    </td>
        <td>
            <%=
                resultSet.getString(2)
            %>
        </td>
        <td>
            <%=
                resultSet.getString(3)
            %>
        </td>
        <td>
            <%=
                resultSet.getString(4)
            %>
        </td>

    </tr>
</table>
<%


    }
%>


</body>
</html>

