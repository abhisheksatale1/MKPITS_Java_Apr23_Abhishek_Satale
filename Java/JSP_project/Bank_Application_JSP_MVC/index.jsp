<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <style>
    body{
      background-color: beige;
    }
    .div1{
      background-color: antiquewhite;
      align: center;
    }
  </style>
</head>
<body>

  <form action="Controller/LoginJSP.jsp" method="post">
    <div align="center" margin-top="400px">
    <input type="text" name="Userid" placeholder="--user_id---"><br>
    <input type="text" name="Password" placeholder="--User_Password---"><br>
    <input type="submit" value="Submit"><br>
    Signup<a href="Registration.jsp">New_User</a>
</div>
  </form>

</body>
</html>