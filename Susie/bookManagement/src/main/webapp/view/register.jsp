<%--
  Created by IntelliJ IDEA.
  User: husiqin
  Date: 17/1/13
  Time: 上午12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bookM/plugins/Flat-UI-master/dist/css/flat-ui.css">
</head>
<body>
<div class="login-form">
    <form>
        <div class="login-form">
            <div class="form-group">
                <input type="text" class="form-control login-field" value="" placeholder="Enter your name" id="login-name" />
                <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="form-group">
                <input type="password" class="form-control login-field" value="" placeholder="Password" id="login-pass" />
                <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

            <div class="form-group">
                <input type="email" class="form-control login-field" value="" placeholder="Enter your email" id="login-email" />
                <label class="login-field-icon fui-mail" for="login-email"></label>
            </div>

            <label class="checkbox" for="checkbox1">
                <input type="checkbox" checked="checked" value="" id="checkbox1" data-toggle="checkbox" checked="" disabled="">
                Client
            </label>
            <label class="checkbox" for="checkbox2">
                <input type="checkbox" value="" id="checkbox2" data-toggle="checkbox">
                Admin
            </label>
            <label class="checkbox" for="checkbox3">
                <input type="checkbox" value="" id="checkbox3" data-toggle="checkbox">
                Seller
            </label>
            <button class="btn btn-primary btn-lg btn-block" >Register</button>
        </div>
    </form>
</div>
</body>
</html>
