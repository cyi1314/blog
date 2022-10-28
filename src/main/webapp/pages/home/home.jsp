<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/26
  Time: 13:14
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
        <div id="main_right">
            <h2>欢迎信息</h2>
            <p>
                南京邮电大学（Nanjing University of Posts and Telecommunications），位于南京市，简称南邮（NJUPT），是教育部、工业和信息化部、国家邮政局与江苏省共建高校，国家“双一流”建设高校， [55]  江苏高水平大学建设高峰计划A类建设高校 ；入选国家“2011计划”、“111计划”、教育部“卓越工程师教育培养计划”、“新工科研究与实践项目”、国家级大学生创新创业训练计划，国际电信联盟首个学术成员，CDIO工程教育联盟成员单位，国际电信联盟亚太电信组织在华培训基地之一；是以电子信息为特色，工学门类为主体，理、工、经、管、文、教、艺、法等多学科相互交融，本硕博等多层次教育协调发展的重点大学。
            </p>


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

