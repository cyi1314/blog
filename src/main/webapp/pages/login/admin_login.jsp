<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/26
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员登录页</title>
    <base href="http://localhost:8081/">
</head>
<body>
<h1 align="center">管理员登录！</h1><br>
<h3 align="center">(无效登录无法跳转，页面会重新加载)</h3>

<form action="loginServlet", method="post" >
    <table align="center" >

        <tr>
            <th> </th>
            <th> </th>
            <th> </th>
        </tr>

        <tr>
            <td>
                用户名：
            </td>
            <td>
                <input type="text" name="username" >
            </td>
        </tr>

        <tr>
            <td>
                密码：
            </td>
            <td>
                <input type="password" name="password" >
            </td>
        </tr>


        <tr>

            <td>

            </td>
            <td>
                <input type="submit" value="登录">
            </td>
            <td>

            </td>
        </tr>

        <tr>
            <td> </td>
            <td> </td>
            <td> </td>
        </tr>
    </table>
</form>

</body>
</html>
