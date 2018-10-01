<%-- 
    Document   : login
    Created on : Sep 27, 2018, 12:25:56 PM
    Author     : 758243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Remember Me Login Page</h1>
        <form action="login" method="post">
            Username: <input type="text" name="userName" value="${userName}"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="Login"><br>
            <input type="checkbox" name="rememberMe" value="rememberMe">Remember me<br>
        </form>
        <div>
            ${invalidLogin}
        </div>
    </body>
</html>
