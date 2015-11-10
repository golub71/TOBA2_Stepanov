
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
        <link rel="stylesheet" href="toba.css" type="text/css">
    </head>
    
    <c: import url="header.html"/>
    <body>
        <header></header>
        <br>
        <br>
        <br>
        <br>
        <h1>Reset Your Password</h1>
        <form action="resetPassword" method="GET">
        <p align="center">New Password:<input type="text" name="newPassword" value="$(user.password)"><br>
            <input type="submit" value="submit"></p>
        </form>
    <c: import url="footer.jsp"/>
    </body>
</html>
