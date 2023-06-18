<%--
  Created by IntelliJ IDEA.
  User: Mehrshad
  Date: ۱۷/۰۶/۲۰۲۳
  Time: ۰۳:۳۱ بعدازظهر
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<jsp:directive.include file="header.jsp"/>
<div align="center">
    <H2>please login: </H2>
    <form>
        Email: <input type="text" size="10"><br><br>
        password: <input type="password" size="10"><br><br>
        <input type="submit" value="Login">
    </form>
</div>

<jsp:directive.include file="footer.jsp"/>
</body>
</html>
