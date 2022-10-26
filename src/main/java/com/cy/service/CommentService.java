package com.cy.service;

import com.cy.pojo.Comment;

import java.util.List;

public interface CommentService {
    public void addComment(Comment comment);

    public void deleteCommentById(Integer comment_id);

    public Comment queryCommentById(Integer comment_id);

    public List<Comment> queryComments();
}
