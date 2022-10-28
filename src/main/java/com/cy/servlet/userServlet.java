package com.cy.servlet;

import com.cy.pojo.Blog;
import com.cy.pojo.Comment;
import com.cy.pojo.User;
import com.cy.service.BlogService;
import com.cy.service.CommentService;
import com.cy.service.UserService;
import com.cy.service.impl.BlogServiceImpl;
import com.cy.service.impl.CommentServiceImpl;
import com.cy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class userServlet extends HttpServlet {

    private UserService userService=new UserServiceImpl();
    private BlogService blogService=new BlogServiceImpl();
    private CommentService commentService=new CommentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("经过post");

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

    protected void userlist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("经过list");
        //1、通过userService查询全部用户
        List<User> users = userService.queryUsers();
        //2、把全部用户保存到request域中
        req.setAttribute("users",users);
        //3、请求转发到admin_home.jsp页面
        req.getRequestDispatcher("/pages/admin/admin_user.jsp").forward(req,resp);
    }

    protected void userdelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1、获取userID
        String user_id = req.getParameter("user_id");
        //调用userService()方法
        userService.deleteUserById(Integer.valueOf(user_id));
        //重定向
        resp.sendRedirect(req.getContextPath()+"/userServlet?action=userlist");
    }

    protected void bloglist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("经过list");
        //1、通过blogService查询全部博客
        List<Blog> blogs = blogService.queryBlogs();
        //2、把全部博客保存到request域中
        req.setAttribute("blogs",blogs);
        //3、请求转发到admin_blog.jsp页面
        req.getRequestDispatcher("/pages/admin/admin_blog.jsp").forward(req,resp);
    }
    protected  void blogdelete(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        //1、获取请求的博客ID
        String blog_id = req.getParameter("blog_id");
        //2/调用blogService()方法
        blogService.deleteBlog((Integer.valueOf(blog_id)));
        //重定向
        resp.sendRedirect(req.getContextPath() + "/userServlet?action=bloglist");
    }

    protected void commentlist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("经过list");
        //1、通过commentService查询对应评论
        String blog_id = req.getParameter("blog_id");
        List<Comment> comments = commentService.queryCommentByBlogId((Integer.valueOf(blog_id)));
        //2、把全部博客保存到request域中
        req.setAttribute("comments",comments);
        //3、请求转发到admin_comment.jsp页面
        req.getRequestDispatcher("/pages/admin/admin_comment.jsp").forward(req,resp);
    }
    protected  void commentdelete(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        //1、获取请求的博客ID
        String comment_id = req.getParameter("comment_id");
        String blog_id = req.getParameter("blog_id");
        //2/调用commentService()方法
        commentService.deleteCommentById((Integer.valueOf(comment_id)));
        //重定向
        resp.sendRedirect(req.getContextPath() + "/userServlet?action=commentlist&blog_id="+blog_id);
    }
}
