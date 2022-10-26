package com.cy.test;


import com.cy.pojo.Blog;
import com.cy.service.BlogService;
import com.cy.service.impl.BlogServiceImpl;
import org.junit.jupiter.api.Test;

class BlogServiceImplTest {

    private BlogService blogService=new BlogServiceImpl();

    @Test
    void addBlog(){blogService.addBlog(new Blog(null,5,"测试","测试内容"));}

    @Test
    void deleteBlog() {blogService.deleteBlog(7); }

    @Test
    void updateBlog() {blogService.updateBlog(new Blog(6,6,"更新测试","更新内容测试"));}

    @Test
    void queryBlogbyId() {
        Blog blogTest = blogService.queryBlogbyId(6);
        System.out.println(blogTest.getBlog_content());
    }

    @Test
    void queryBlogs(){
        for(Blog blog:blogService.queryBlogs())
            System.out.println(blog);
    }

    @Test
    void exitBlog(){
        if(blogService.exitBlog(6)){
            System.out.println("博客已存在");
        }else{
            System.out.println("博客不存在");
        }
    }
}
