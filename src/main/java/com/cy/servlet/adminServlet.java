package com.cy.servlet;

import com.cy.pojo.Admin;
import com.cy.service.AdminService;
import com.cy.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class adminServlet extends HttpServlet {

    private AdminService adminService = new AdminServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //1、获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //2、使用service处理业务，adminService.login()登录
        Admin loginAdmin = adminService.login(new Admin(null, username, password));
        //3、根据login()方法的返回值判断登录是否成功

        //如果等于null，说明登录失败
        if(loginAdmin==null){
            //失败，则返回登录页面
            System.out.println("用户名或密码错误，登录失败！");

            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().print("<script language='javascript'>alert('用户名或密码错误，登录失败！');" +
                    "window.location.href='/pages/login/admin_login.jsp';</script>");

            //req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }else {
            //成功，则跳转到成功页面admin_home.jsp
            System.out.println("登录成功");

            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().print("<script language='javascript'>alert('登录成功！');" +
                    "window.location.href='/pages/home/admin_home.jsp';</script>");

            //req.getRequestDispatcher("/pages/home/admin_home.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
