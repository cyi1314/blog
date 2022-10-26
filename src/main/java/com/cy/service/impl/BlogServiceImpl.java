package com.cy.service.impl;

import com.cy.dao.BlogDao;
import com.cy.dao.impl.BlogDaoImpl;
import com.cy.pojo.Blog;
import com.cy.service.BlogService;

import java.util.List;

public class BlogServiceImpl implements BlogService{

    private BlogDao blogdao=new BlogDaoImpl();

    @Override
    public void addBlog(Blog blog) {
        blogdao.addBlog(blog);
    }

    @Override
    public void deleteBlog(Integer blog_id) {
        blogdao.deleteBlog(blog_id);
    }

    @Override
    public void updateBlog(Blog blog) {
        blogdao.updateBlog(blog);
    }

    @Override
    public Blog queryBlogbyId(Integer blog_id) {
        return blogdao.queryBlogbyBlogId(blog_id);
    }

    @Override
    public List<Blog> queryBlogs() {
        return blogdao.queryBlogs();
    }

    @Override
    public boolean exitBlog(Integer blog_id) {
        if (blogdao.queryBlogbyBlogId(blog_id) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Blog> queryBlogsBySec(String blog_section) {
        return blogdao.queryBlogsByBlogSec(blog_section);
    }
}
