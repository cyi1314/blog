<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/10/26
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
    <base href="http://localhost:8081/">
</head>
<body>
<h1 align="center">高校学生博客注册</h1> <br>

<h3 align="center">(无效注册无法跳转，页面会重新加载)</h3>
<form action="registServlet", method="post" >
    <table align="center">

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
                确认密码：
            </td>
            <td>
                <input type="password" name="password" >
            </td>
        </tr>

        <tr>
            <td>
                邮箱：
            </td>
            <td>
                <input type="text" name="mail" >
            </td>
        </tr>

        <tr>
            <td>
                性别：
            </td>
            <td>
                <select name="gender">
                    <option selected="selected">==请选择==</option>
                    <option value="male">male</option>
                    <option value="female">female</option>
                </select>
            </td>
        </tr>

        <tr>

            <td>

            </td>
            <td>
                <input type="submit" value="注册">
            </td>
            <td>

            </td>
        </tr>
    </table>

</form>
</body>
</html>
