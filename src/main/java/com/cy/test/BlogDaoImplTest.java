package com.cy.test;

import com.cy.dao.BlogDao;
import com.cy.dao.impl.BlogDaoImpl;
import com.cy.pojo.Blog;
import org.junit.jupiter.api.Test;

class BlogDaoImplTest {
    private BlogDao blogDao=new BlogDaoImpl();
    @Test
    void addBlog(){ blogDao.addBlog(new Blog(null,6,"mysql","测试用例"));}
    @Test
    void deleteBlog(){blogDao.deleteBlog(2);}
    @Test
    void updateBlog(){blogDao.updateBlog(new Blog (6,6,"mysqltest","更新数据"));}
    @Test
    void queryBlogbyBlogId(){
        System.out.println(blogDao.queryBlogbyBlogId(6));
    }
    @Test
    void queryBlogs(){
        for (Blog blog : blogDao.queryBlogs()) {
        System.out.println(blog);
    }}
}
