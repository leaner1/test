<%@ page import="utl.DBUTIL.model.User" %><%--
  Created by IntelliJ IDEA.
  User: husiq
  Date: 12/30/2016
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userAccount</title>
</head>
<body>
<%
    User user = (User)session.getAttribute("user");
%>
Welcome <%=user.getName()%> !
    <ul>
        <li>UserName:&nbsp&nbsp&nbsp&nbsp<%=user.getName()%></li>
        <li>Client:&nbsp&nbsp&nbsp&nbsp<%=user.getClient()%></li>
        <li>Seller:&nbsp&nbsp&nbsp&nbsp<%=user.getSeller()%></li>
        <li>Admin:&nbsp&nbsp&nbsp&nbsp<%=user.getAdmin()%></li>
    </ul>
</body>
</html>
