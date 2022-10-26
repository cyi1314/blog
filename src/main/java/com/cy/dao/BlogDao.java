package com.cy.dao;

import com.cy.pojo.Blog;

import java.util.List;

public interface BlogDao {

    public int addBlog(Blog blog);

    public int deleteBlog(Integer blog_id);

    public int updateBlog(Blog blog);

    /**
     * 根据博客Id查询博客
     * @param blog_id 博客Id
     * @return 如果返回null，说明没有这个博客
     */
    public Blog queryBlogbyBlogId(Integer blog_id);

    public List<Blog> queryBlogs();
}
