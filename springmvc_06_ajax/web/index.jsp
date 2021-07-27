<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajax</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.min.js"></script>
<%--    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>--%>
    <script>
    function a() {

      $.post({
        url:"${pageContext.request.contextPath}/a1",
        data:{'name':$("#username").val()},
        success:function (data,status) {
          alert(data);
          alert(status);
        }
      });

    }
    </script>
  </head>
  <body>
    用户名：<input id="username" type="text" onblur="a()">
  </body>
</html>
