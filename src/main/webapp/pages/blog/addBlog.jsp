<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/27
  Time: 14:16
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
        <img  src="pages/image/banner.jpg" alt="test">
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
            <h2>试着发布一个博客吧！</h2>
            <form action="blogServlet", method="post" >
                <input type="hidden" name="action" value="add">
                <table align="center" >
                    <tr>
                        <td>
                            博客编号：
                        </td>
                        <td>
                            <input type="text" name="blog_id" style="width: 50px" >（编号唯一，若已被使用为无效发帖）
                        </td>
                    </tr>

                    <tr>
                        <th>
                        <td><br></td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                    </tr>

                    <tr>
                        <td>
                            博主编号：
                        </td>
                        <td>
                            <input type="text" name="user_id" style="width: 50px" >
                        </td>
                    </tr>

                    <tr>
                        <th>
                        <td><br></td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                    </tr>

                    <tr>
                        <td>
                            分区编号：
                        </td>
                        <td>
                            <select name="blog_section">
                                <option selected="selected">==请选择==</option>
                                <option value="01">01(学习)</option>
                                <option value="02">02(生活)</option>
                                <option value="03">03(工作)</option>
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <th>
                        <td><br></td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                    </tr>

                    <tr>
                        <td>
                            博客标题：
                        </td>
                        <td>
                            <input type="text" name="blog_title" style="width: 500px" >
                        </td>
                    </tr>


                    <tr>
                        <th>
                        <td><br></td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                        <th>
                        <td> </td>
                        </th>
                    </tr>


                    <tr>

                        <td>
                            博客内容：
                        </td>
                        <td>
                            <input type="text" name="blog_content" style="height:100px;width:500px">
                        </td>
                        <td>

                        </td>
                    </tr>

                    <br>
                    <br>
                    <br>
                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    <tr>

                        <td> </td>
                        <td>
                            <input type="submit" value="发布博客">
                        </td>
                        <td></td>
                    </tr>



                </table>
            </form>


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

