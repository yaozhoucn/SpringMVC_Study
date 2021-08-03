<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <%--<script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.min.js"></script>--%>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>
        function a1() {
            $.post({
                url:"/a2",
                data:{"name":$("#name").val()},
                success:function (data) {
                    if (data.toString()==="ok"){
                        $("#userInfo").css("color","green");
                    }else {
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.post({
                url:"/a2",
                data:{"password":$("#password").val()},
                success:function (data) {
                    if (data.toString()==="ok"){
                        $("#pwdInfo").css("color","green");
                    }else {
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
<p>
    用户名：<input type="text" onblur="a1()" id="name">
    <span id="userInfo"></span>
</p>

<p>
    密码：<input type="text" onblur="a2()" id="password">
    <span id="pwdInfo"></span>
</p>

</body>
</html>
