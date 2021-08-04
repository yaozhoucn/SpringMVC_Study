<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<%--在web-inf下的页面只能通过controller或者servlet进行访问--%>
    <h1>登陆首页</h1>
    <form action="/user/loginInterceptor" method="post">
        username：<input type="text" name="username" value="请输入用户名"> <br>
        password：<input type="password" name="password" > <br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
