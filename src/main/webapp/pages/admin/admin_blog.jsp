<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/28
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客管理</title>
    <base href="http://localhost:8081/">
    <%@ page isELIgnored="false" %>
</head>
<body >
<h1 align="center">博客基本信息</h1>
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
            <td>博客编号 </td>
            <td>所属用户编号 </td>
            <td>博客标题 </td>
            <td>博客内容 </td>
            <td>博客分类 </td>
            <td>博客评论</td>
            <td>操作 </td>

        </tr>

        <c:forEach items="${requestScope.blogs}" var="blogs" varStatus="status">
            <tr>
                <td> ${ status.index + 1}</td>
                <td>${blogs.user_id}</td>
                <td>${blogs.blog_title}</td>
                <td>${blogs.blog_content}</td>
                <td>${blogs.blog_section}</td>
                <td><a href="userServlet?action=commentlist&blog_id=${blogs.blog_id}">查看评论</a></td>
                <td><a href="userServlet?action=blogdelete&blog_id=${blogs.blog_id}">删除</a> </td>
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
