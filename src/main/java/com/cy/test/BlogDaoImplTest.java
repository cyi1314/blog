package com.cy.test;

import com.cy.dao.BlogDao;
import com.cy.dao.impl.BlogDaoImpl;
import com.cy.pojo.Blog;
import org.junit.jupiter.api.Test;

class BlogDaoImplTest {
    private BlogDao blogDao=new BlogDaoImpl();
    @Test
    void addBlog(){ blogDao.addBlog(new Blog(null,4,"mysql-test","测试用例","01"));}
    @Test
    void deleteBlog(){blogDao.deleteBlog(2);}
    @Test
    void updateBlog(){blogDao.updateBlog(new Blog (1,6,"mysqltest","更新数据","01"));}
    @Test
    void queryBlogbyBlogId(){
        System.out.println(blogDao.queryBlogbyBlogId(1));
    }
    @Test
    void queryBlogs(){
        for (Blog blog : blogDao.queryBlogs()) {
        System.out.println(blog);
    }
    }
    @Test
    void queryBlogsBySec(){
        System.out.println(blogDao.queryBlogsByBlogSec("01"));
    }

}
