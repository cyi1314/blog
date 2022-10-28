<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/28
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <base href="http://localhost:8081/">
    <%@ page isELIgnored="false" %>
</head>
<body >
<h1 align="center">用户基本信息</h1>
<br>
<div>
    <table align="center" border="border">
        <tr>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
        </tr>
        <tr>
            <td>用户编号 </td>
            <td>用户名 </td>
            <td>用户密码 </td>
            <td>用户性别 </td>
            <td>用户邮箱 </td>
            <td>用户粉丝数 </td>
            <td>操作 </td>


        </tr>

        <c:forEach items="${requestScope.users}" var="users" varStatus="status">
            <tr>
                <td> ${ status.index + 1}</td>
                <td>${users.user_name}</td>
                <td>${users.user_password}</td>
                <td>${users.user_gender}</td>
                <td>${users.user_mail}</td>
                <td>${users.user_fans}</td>
                <td><a href="userServlet?action=userdelete&user_id=${users.user_id}">删除</a> </td>
            </tr>
        </c:forEach>
        <tr>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
            <th> </th>
        </tr>

    </table>

</div>
</body>
</html>
