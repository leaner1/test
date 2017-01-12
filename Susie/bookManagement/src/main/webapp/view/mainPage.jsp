<%--
  Created by IntelliJ IDEA.
  User: husiq
  Date: 12/22/2016
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mainPage</title>
</head>
<body>
    Welcome!
    you are in mainPage!
    <%--<form action="servlet/logout" method="get">--%>
        <%----%>
    <%--</form>--%>
    <%--<input type="button" value="退出" onclick="">--%>
    <a href="logout.jsp">退出</a>
    <a href="userAccount.jsp">用户信息</a>
    <p>
    numOfUser: <%=session.getServletContext().getAttribute("numOfUsers")%>
    </p>
    numOfUsers:${numOfUsers}

</body>
</html>
