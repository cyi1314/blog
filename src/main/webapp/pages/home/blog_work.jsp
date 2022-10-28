<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/27
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户主页</title>
    <base href="http://localhost:8081/">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="pages/css/home.css">
</head>
<body>
<div id="bigBox"  >
    <div id="banner" >
        <img src="pages/image/banner.jpg" alt="test">
    </div>
    <nav>
        <a href="blogServlet?action=list">博客首页</a>
        <a href="blogServlet?action=section_list1&blog_section=01">学习</a>
        <a href="blogServlet?action=section_list2&blog_section=02">生活</a>
        <a href="blogServlet?action=section_list3&blog_section=03">工作</a>
        <a href="pages/blog/addBlog.jsp">发布博客</a>
        <a href="pages/blog/updateBlog.jsp">更新博客</a>
    </nav>
    <div id="main">
        <div id="main_left">
            <h2>我的信息</h2>
            <img src="pages/image/me.png" alt="">
            <p>
                <span>用户名</span>:<br>
                <span>性别</span>:<br>
                <span>邮箱</span>:<br>
                <span>粉丝数</span>:
            </p>
        </div>
        <h2 id="content_show">工作区博客</h2>
        <div id="main_right">
            <table align="center" border="border">
                <tr>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                </tr>
                <tr>
                    <td>博客编号 </td>
                    <td>用户编号</td>
                    <td>博客标题 </td>
                    <td>博客内容</td>
                    <td>博客板块</td>
                </tr>

                <c:forEach items="${requestScope.blogs}" var="blogs">
                    <tr>
                        <td>${blogs.blog_id}</td>
                        <td>${blogs.user_id}</td>
                        <td>${blogs.blog_title}</td>
                        <td>${blogs.blog_content}</td>
                        <td>${blogs.blog_section}</td>
                    </tr>
                </c:forEach>

                <tr>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                </tr>

            </table>

        </div>
    </div>
    <footer>
        <p>
            版权所有©B19031332曹宇. All rights reserved
        </p>
    </footer>

</div>
</body>
</html>
