package com.cy.servlet;

import com.cy.pojo.Comment;
import com.cy.service.CommentService;
import com.cy.service.impl.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class commentServlet extends HttpServlet {
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

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1、获取请求的评论ID
        String comment_id = req.getParameter("comment_id");
        //调用commentService()方法
        commentService.deleteCommentById(Integer.valueOf(comment_id));
        //重定向
        resp.sendRedirect(req.getContextPath()+"/commentServlet?action=list");

    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取请求的参数
        String comment_id = req.getParameter("comment_id");
        String blog_id = req.getParameter("blog_id");
        String user_id = req.getParameter("user_id");
        String comment_content = req.getParameter("comment_content");

        //  2、检查评论ID是否可用
        if(commentService.queryCommentById(Integer.valueOf(comment_id))!=null){
            //     不可用：
            //          跳回发布页面
            System.out.println("评论已存在！");
            req.getRequestDispatcher("/pages/comment/comment.jsp").forward(req,resp);
        }else {
            //      可用：
            //         调用service保存到数据库
            System.out.println("进入addComment");
            commentService.addComment(new Comment(Integer.valueOf(comment_id),Integer.valueOf(blog_id),Integer.valueOf(user_id),comment_content));
            System.out.println("成功发布评论！");
            //跳转到评论信息页面
            resp.sendRedirect(req.getContextPath()+"/commentServlet?action=list");
        }
    }
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("经过list");
        //1、通过commentService查询全部评论
        List<Comment> comments = commentService.queryComments();
        //2、把全部评论保存到request域中
        req.setAttribute("comments",comments);
        //3、请求转发到comment.jsp页面
        req.getRequestDispatcher("/pages/comment/comment.jsp").forward(req,resp);
    }
}
