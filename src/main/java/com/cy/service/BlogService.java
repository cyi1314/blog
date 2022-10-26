package com.cy.service;

import com.cy.dao.BlogDao;
import com.cy.pojo.Blog;

import java.util.List;

public interface BlogService {
    public void addBlog(Blog blog);

    public void deleteBlog(Integer blog_id);

    public void updateBlog(Blog blog);

    public Blog queryBlogbyId(Integer blog_id);

    public List<Blog> queryBlogs();

    public boolean exitBlog(Integer blog_id);
}