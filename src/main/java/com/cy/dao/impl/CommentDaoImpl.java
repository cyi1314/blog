package com.cy.dao.impl;

import com.cy.dao.BaseDao;
import com.cy.dao.CommentDao;
import com.cy.pojo.Comment;

import java.util.List;

public class CommentDaoImpl extends BaseDao implements CommentDao {

    @Override
    public int addComment(Comment comment) {
        String sql = "insert into comment (`comment_id`,`blog_id`,`user_id`,`comment_content`) values(?,?,?,?) ";
        return update(sql,comment.getComment_id(),comment.getBlog_id(),comment.getUser_id(),comment.getComment_content());
    }

    @Override
    public int deleteCommentById(Integer comment_id) {
        String sql = "delete from comment where comment_id=?";
        return update(sql,comment_id);
    }

//    @Override
//    public int updateComment(Comment comment) {
//        return 0;
//    }

    @Override
    public Comment queryCommentById(Integer comment_id) {
        String sql = "select `comment_id`,`blog_id`,`user_id`,`comment_content`from comment where comment_id = ? ";
        return queryForOne(Comment.class,sql,comment_id);
    }

    @Override
    public List<Comment> queryComments() {
        String sql = "select `comment_id`,`blog_id`,`user_id`,`comment_content`from comment ";
        return queryForList(Comment.class,sql);
    }

    @Override
    public List<Comment> queryCommentByBlogId(Integer blog_id) {
        String sql = "select `comment_id`,`blog_id`,`user_id`,`comment_content`from comment where blog_id = ? ";
        return queryForList(Comment.class,sql,blog_id);
    }
}
