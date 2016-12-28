<%--
  Created by IntelliJ IDEA.
  User: husiqin
  Date: 16/12/27
  Time: 下午11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookM</title>
</head>
<body>
    <h1>ByeBye, <%=session.getAttribute("user") %>!</h1>
    <%
        response.setHeader("refresh","2;url=../index.jsp");
        session.removeAttribute("user");
        session.invalidate();
    %>
    <h3>你好,你已经退出本系统,两秒后跳会首页</h3>
    <h3>如没有跳转,请按<a href="../index.jsp">这里</a>

</body>
</html>
