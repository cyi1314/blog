package com.cy.pojo;

public class Comment {
    private Integer comment_id;
    private Integer blog_id;
    private Integer user_id;
    private String comment_content;

    public Comment(){}

    public Comment(Integer comment_id,Integer blog_id,Integer user_id,String comment_content){
        this.comment_id=comment_id;
        this.blog_id=blog_id;
        this.user_id=user_id;
        this.comment_content=comment_content;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
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

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

}
