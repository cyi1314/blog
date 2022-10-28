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
    <title>评论管理</title>
    <base href="http://localhost:8081/">
    <%@ page isELIgnored="false" %>
</head>
<body >
<h1 align="center">评论基本信息</h1>
<br>
<div>
    <table align="center" border="border">
        <tr>
            <th> </th>
            <th> </th>
            <th> </th>

        </tr>
        <tr>
            <td>评论编号 </td>
            <td>评论内容 </td>
            <td>操作 </td>


        </tr>

        <c:forEach items="${requestScope.comments}" var="comments" varStatus="status">
            <tr>
                <td> ${ status.index + 1}</td>
                <td>${comments.comment_content}</td>
                <td><a href="userServlet?action=commentdelete&comment_id=${comments.comment_id}&blog_id=${comments.blog_id}">删除</a> </td>
            </tr>
        </c:forEach>
        <tr>
            <th> </th>
            <th> </th>
            <th> </th>

        </tr>

    </table>

</div>
</body>
</html>

