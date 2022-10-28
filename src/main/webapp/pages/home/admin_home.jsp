<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/26
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页</title>
    <base href="http://localhost:8081/">
</head>
<body >
<h1 align="center" >管理系统</h1>

<table  align="center" >
    <tr>
        <th> </th>
        <th> </th>
        <th> </th>
    </tr>

    <tr>
        <td> </td>
        <td>
            <a href="userServlet?action=userlist"><h3>用户管理</h3></a>
        </td>
        <td> </td>

    </tr>

    <tr>
        <td> </td>
        <td>
            <a href="userServlet?action=bloglist"><h3>博客管理</h3></a>
        </td>
        <td> </td>

    </tr>

</table>
</body>
</html>
