
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>高校学生博客系统</title>
    <base href="http://localhost:8081/">
    <link rel="stylesheet" href="pages/css/login.css">
<%--    <style type="text/css">--%>
<%--        a:link{--%>
<%--            color: red;--%>
<%--            text-decoration: none;--%>
<%--        }--%>
<%--        a:visited{--%>
<%--            color: blue;--%>
<%--            text-decoration: none;--%>
<%--        }--%>
<%--        a:hover{--%>
<%--            color: green;--%>
<%--            text-decoration: none;--%>
<%--        }--%>
<%--        a:active{--%>
<%--            color: black;--%>
<%--            text-decoration: none;--%>
<%--        }--%>

<%--    </style>--%>
</head>
<body>
<%--<h1 align="center">欢迎进入学生博客系统！</h1>--%>
<%--<h1 align="center">请登录！</h1><br>--%>
<%--<h3 align="center">(无效登录无法跳转，页面会重新加载)</h3>--%>

<form action="loginServlet", method="post" >

    <div class="box">
        <h2>Login</h2>
        <div class="input-box">
            <label for="">账号</label>
            <input type="text" name="username">
        </div>
        <div class="input-box">
            <label for="">密码</label>
            <input type="password" name="password">
        </div>
        <div class="btn-box">
            <a href="pages/login/admin_login.jsp">管理员登录</a>
            <div>
<%--                <button alert="确定登录？">登录</button>--%>
<%--                <button>注册</button>--%>
            <input type="submit" value="登录">
            <a href="pages/regist/regist.jsp" >注册</a>
            </div>
        </div>
    </div>


    <%--    <table align="center" >--%>

<%--        <tr>--%>
<%--            <th> </th>--%>
<%--            <th> </th>--%>
<%--            <th> </th>--%>
<%--        </tr>--%>

<%--        <tr>--%>
<%--            <td>--%>
<%--                用户名：--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <input type="text" name="username" >--%>
<%--            </td>--%>
<%--        </tr>--%>

<%--        <tr>--%>
<%--            <td>--%>
<%--                密码：--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <input type="password" name="password" >--%>
<%--            </td>--%>
<%--        </tr>--%>


<%--        <tr>--%>

<%--            <td>--%>

<%--            </td>--%>
<%--            <td>--%>
<%--                <input type="submit" value="登录">--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="pages/login/admin_login.jsp" >管理员登录</a>--%>
<%--            </td>--%>
<%--        </tr>--%>

<%--        <tr>--%>
<%--            <td> </td>--%>
<%--            <td>--%>
<%--                <a href="pages/regist/regist.jsp" >无账号用户请先注册！</a>--%>
<%--            <td>--%>
<%--            <td> </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
</form>

</body>

</html>
