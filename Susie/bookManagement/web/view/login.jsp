<%--
  Created by IntelliJ IDEA.
  User: husiqin
  Date: 16/11/24
  Time: 下午11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%=session.getAttribute("Title")%></title>
    <link rel="stylesheet" type="text/css" href=<%=request.getContextPath() + "/css/login.css"%> >
    <%--<link rel="stylesheet" type="text/css" href="/happyReading/css/login.css">--%>
</head>
<body>
<div class="loginBox">
    <div id="loginInfo">
        <form>
            <div>
                <input type="text" id="userName" value="邮箱/会员账号/手机号码">
            </div>
            <div>
                <input type="password" id="password" value="请输入密码">
            </div>
            <div>
                <input type="submit" id="submit" value="登录">
            </div>
        </form>
    </div>
    <div id="accoutIssue">
        <div><a href="#">忘记密码?</a></div>
        <div><a href="#">修改密码?</a></div>
        <div><a href="#">注册新账户</a></div>
    </div>
</div>
</body>
</html>
