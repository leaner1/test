<%--
  Created by IntelliJ IDEA.
  User: husiqin
  Date: 16/11/24
  Time: 下午11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title><%=session.getAttribute("Title")%></title>
    <link rel="stylesheet" type="text/css" href=<%=request.getContextPath() + "/css/login.css"%> >
    <link rel="stylesheet" type="text/css" href=<%=request.getContextPath() + "/css/buttons.css"%> >
    <%--<link rel="stylesheet" type="text/css" href="/happyReading/css/login.css">--%>
    <link rel="stylesheet" href="/bookM/plugins/Flat-UI-master/dist/css/flat-ui.css">
    <script src=<%=request.getContextPath() + "/js/plugins/jquery-3.1.1.min.js"%>></script>
    <script src=<%=request.getContextPath() + "/js/plugins/layer.js"%>></script>
    <script src=<%=request.getContextPath() + "/js/register.js"%>></script>
</head>
<body>
<%
    if (session.getAttribute("user")!=null){
        response.setHeader("refresh","1;url=/bookM/view/mainPage.jsp");
    }
%>


<div class="loginBox">
    <div class="login-form">
        <form action="servlet/UserVerify" method="post">
            <div class="form-group">
                <input type="text" class="form-control login-field" value="" placeholder="Enter your name" id="login-name" name="userName" />
                <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="form-group">
                <input type="password" class="form-control login-field" value="" placeholder="Password" id="login-pass" name="password"/>
                <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

            <button type="submit" class="btn btn-primary btn-lg btn-block">Log in</button>
            <button id="register" type="button" class="btn btn-primary btn-lg btn-block">Register</button>
        </form>

        <a class="login-link" href="#">Lost your password?</a>
    </div>
    <%--<div id="loginInfo">--%>
        <%--<form action="servlet/UserVerify" method="post">--%>
            <%--<div>--%>
                <%--<input type="text" id="userName" name="userName">--%>
            <%--</div>--%>
            <%--<div>--%>
                <%--<input type="password" id="password" name="password">--%>
            <%--</div>--%>
            <%--<div>--%>
                <%--<input type="submit" id="submit" value="登录">--%>
            <%--</div>--%>
        <%--</form>--%>
    <%--</div>--%>
    <%--<div id="accoutIssue">--%>
        <%--&lt;%&ndash;<div><button class = "button button-primary button-rounded button-small">忘记密码?</button></div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<div><button class = "button button-primary button-rounded button-small">修改密码?</button></div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<div><button id="register" class="button button-primary button-rounded button-small">注册新用户</button></div>&ndash;%&gt;--%>
            <%--<button class = "button button-primary button-rounded button-small">忘记密码?</button>--%>
            <%--<button class = "button button-primary button-rounded button-small">修改密码?</button>--%>
            <%--<button id="register" class="button button-primary button-rounded button-small">注册新用户</button>--%>
    <%--</div>--%>
   </div>
</body>
</html>
