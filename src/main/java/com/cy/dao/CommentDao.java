package com.cy.dao;

import com.cy.pojo.Comment;

import java.util.List;

public interface CommentDao {

    public  int addComment(Comment comment);

    public  int deleteCommentById(Integer comment_id);

//    public  int updateComment(Comment comment);

    public  Comment queryCommentById(Integer comment_id);

    public List<Comment> queryComments();

    public  List<Comment> queryCommentByBlogId(Integer blog_id);
}
