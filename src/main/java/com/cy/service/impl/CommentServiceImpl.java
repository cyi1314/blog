package com.cy.service.impl;

import com.cy.dao.CommentDao;
import com.cy.dao.impl.CommentDaoImpl;
import com.cy.pojo.Comment;
import com.cy.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    CommentDao commentDao =new CommentDaoImpl();
    @Override
    public void addComment(Comment comment) {
        commentDao.addComment(comment);
    }

    @Override
    public void deleteCommentById(Integer comment_id) {
        commentDao.deleteCommentById(comment_id);
    }

    @Override
    public Comment queryCommentById(Integer comment_id) {
        return commentDao.queryCommentById(comment_id);
    }

    @Override
    public List<Comment> queryComments() {
        return commentDao.queryComments();
    }


    @Override
    public List<Comment> queryCommentByBlogId(Integer blog_id) {
        return commentDao.queryCommentByBlogId(blog_id);
    }
}
