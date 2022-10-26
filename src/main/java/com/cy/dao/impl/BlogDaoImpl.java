package com.cy.dao.impl;

import com.cy.dao.BaseDao;
import com.cy.dao.BlogDao;
import com.cy.pojo.Blog;

import java.util.List;

public class BlogDaoImpl extends BaseDao implements BlogDao {
    @Override
    public int addBlog(Blog blog) {
        String sql="insert into blog(`blog_id`,`user_id`,`blog_title`,`blog_content`,`blog_section`) values(?,?,?,?,?)";
        return update(sql,blog.getBlog_id(),blog.getUser_id(),blog.getBlog_title(),blog.getBlog_content(),blog.getBlog_section());
    }

    @Override
    public int deleteBlog(Integer blog_id) {
        String sql="delete from blog where blog_id=?";
        return update(sql,blog_id);
    }

    @Override
    public int updateBlog(Blog blog) {
        String sql="update blog set `user_id`=?,`blog_title`=?,`blog_content`=?,blog_section=? where blog_id=?";
        return update(sql,blog.getUser_id(),blog.getBlog_title(),blog.getBlog_content(),blog.getBlog_section(),blog.getBlog_id());
    }

    @Override
    public Blog queryBlogbyBlogId(Integer blog_id) {
        String sql="select `blog_id`,`user_id`,`blog_title`,`blog_content`,`blog_section` from blog where blog_id=?";
        return queryForOne(Blog.class,sql,blog_id);
    }

    @Override
    public List<Blog> queryBlogs() {
        String sql="select * from blog";
        return queryForList(Blog.class,sql);
    }

    @Override
    public List<Blog> queryBlogsByBlogSec(String blog_section) {
        String sql = "select `blog_id`,`user_id`,`blog_title`,`blog_content`,`blog_section` from blog where blog_section=?";
        return queryForList(Blog.class,sql,blog_section);
    }
}
