package com.cy.servlet;


import com.cy.pojo.Blog;
import com.cy.service.BlogService;
import com.cy.service.impl.BlogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class blogServlet extends HttpServlet{

    private BlogService blogService=new BlogServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("经过doPost");

        String action=req.getParameter("action");

        try {
            //获取action业务鉴别字符串，获取相应的业务方法反射对象
            Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);

            //调用目标业务方法
            method.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void add(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        //1、获取请求的参数
        String blog_id = req.getParameter("blog_id");
        String user_id = req.getParameter("user_id");
        String blog_title = req.getParameter("blog_title");
        String blog_content = req.getParameter("blog_content");
        String blog_section = req.getParameter("blog_section");
        if(blogService.exitBlog(Integer.valueOf(blog_id))){
            //帖子存在
            //跳转回发布界面
            System.out.println("博客已存在！！！");
            req.getRequestDispatcher("/pages/blog/blog_add.jsp").forward(req,resp);
        }else{
            //可以发布
            System.out.println("进入addBolg");
            blogService.addBlog(new Blog(Integer.valueOf(blog_id),Integer.valueOf(user_id),blog_title,blog_content,blog_section));
            System.out.println("成功发布博客！！！");
            //重定向
            resp.sendRedirect(req.getContextPath()+"/blogServlet?action=list");
        }
    }

    protected void list(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        System.out.println("经过list");
        //1、通过blogService查询全部帖子
        List<Blog> blogs = blogService.queryBlogs();
        //2、把全部帖子保存到request域中
        req.setAttribute("blogs",blogs);
        //3、请求转发到post_info.jsp页面
        req.getRequestDispatcher("/pages/blog/blog.jsp").forward(req,resp);
    }

    protected  void delete(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        //1、获取请求的博客ID
        String blog_id = req.getParameter("blog_id");
        //2/调用blogService()方法
        blogService.deleteBlog((Integer.valueOf(blog_id)));
        //重定向
        resp.sendRedirect(req.getContextPath()+"/blogServlet?action=list");
    }

    protected  void update(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        //1、获取请求的参数
        String blog_id = req.getParameter("blog_id");
        String user_id = req.getParameter("user_id");
        String blog_title = req.getParameter("blog_title");
        String blog_content = req.getParameter("blog_content");
        String blog_section = req.getParameter("blog_section");
        if(blogService.exitBlog(Integer.valueOf(blog_id))){
            //存在
            System.out.println("博客存在！！！");
            blogService.updateBlog(new Blog(Integer.valueOf(blog_id),Integer.valueOf(user_id),blog_title,blog_content,blog_section));
            //跳转到帖子信息页
            resp.sendRedirect(req.getContextPath()+"/blogServlet?action=list");
        }else{
            System.out.println("博客不存在！！！");
            req.getRequestDispatcher("pages/blog/blog_update.jsp").forward(req,resp);
        }
    }
}
