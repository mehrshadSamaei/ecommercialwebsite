<%--
  Created by IntelliJ IDEA.
  User: Mehrshad
  Date: ۱۷/۰۶/۲۰۲۳
  Time: ۰۴:۵۶ بعدازظهر
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Evergreen Book Store Adminstration</title>
</head>
<body>
<jsp:directive.include file="header.jsp"/>
<br><br>
<div><h2> adminstrative dashboard</h2></div>
<div align="center">
    <hr width="60%"/>
    <h2>quick action</h2>
    <b>
        <a href="create_book">new book</a> &nbsp;
        <a href="create_user">new user</a> &nbsp;
        <a href="create_category">new category</a> &nbsp;
        <a href="create_customer">new customer</a>
    </b>
</div>

<div align="center">
    <hr width="60%"/>
    <h2>recent sales: </h2>
</div>
<div align="center">
    <hr width="60%"/>
    <h2>recent reviews: </h2>
</div>
<div align="center">
    <hr width="60%"/>
    <h2>statics </h2>
    <hr width="60%"/>
</div>
<jsp:directive.include file="footer.jsp"/>
</body>
</html>
