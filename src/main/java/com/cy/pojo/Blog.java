package com.cy.pojo;

public class Blog {
    private Integer blog_id;
    private Integer user_id;
    private String blog_title;
    private String blog_content;
    private String blog_section;

    public Blog(){}

    public Blog(Integer blog_id,Integer user_id,String blog_title,String blog_content,String blog_section){
        this.blog_id=blog_id;
        this.user_id=user_id;
        this.blog_title=blog_title;
        this.blog_content=blog_content;
        this.blog_section=blog_section;
    }
    public Integer getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Integer blog_id) {
        this.blog_id = blog_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }

    public String getBlog_section() {
        return blog_section;
    }

    public void setBlog_section(String blog_section) {
        this.blog_section = blog_section;
    }
}
