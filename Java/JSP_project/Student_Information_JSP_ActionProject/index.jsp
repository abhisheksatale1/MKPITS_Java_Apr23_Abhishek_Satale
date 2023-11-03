<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Student_form" %></h1>
<br/>
<form action="StudentInsertRecord.jsp" method="post">
    <table>
        <tr>
        <input type="text" name="rollno" placeholder="roll No"> </input>
        </tr>
        <tr>
            <input type="text" name="name" placeholder="name"> </input>
        </tr>
        <tr>
            <input type="text" name="address" placeholder="address"> </input>
        </tr>
        <tr>
            <input type="text" name="city" placeholder="city"> </input>
        </tr>

        <tr>
            <input type="submit" value="submit"> </input>
        </tr>
    </table>
</form>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>