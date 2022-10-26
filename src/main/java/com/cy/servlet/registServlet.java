package com.cy.servlet;

import com.cy.pojo.User;
import com.cy.service.UserService;
import com.cy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class registServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 1、获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String mail = req.getParameter("mail");
        String gender = req.getParameter("gender");

        //  2、检查用户名是否可用
        if(userService.existUsername(username)){
            //     不可用：
            //          跳回注册页面
            System.out.println("用户名["+username+"]已存在！");    //控制台打印信息
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().print("<script language='javascript'>alert('用户名已存在！');" +
                    "window.location.href='/pages/regist/regist.jsp';</script>");

            //req.getRequestDispatcher("/pages/regist/regist.jsp").forward(req,resp);      //  '/'打头表示路径从webapp目录开始
        }else {
            //      可用：
            //         调用service保存到数据库
            userService.registUser(new User(null,username,password,gender,mail,0));
            System.out.println("成功创建用户！");
            //         跳转到注册成功页面
            req.getRequestDispatcher("/pages/regist/regist_success.jsp").forward(req,resp);

        }

    }

}
