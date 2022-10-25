package com.cy.pojo;

public class User {
    private Integer user_id;
    private String user_name;
    private String user_password;
    private String user_gender;
    private String user_mail;
    private Integer user_fans;

    public User(){}

    public User(Integer user_id,String user_name,
                String user_password,String user_gender,String user_mail,Integer user_fans){
        this.user_id=user_id;
        this.user_name=user_name;
        this.user_password=user_password;
        this.user_gender=user_gender;
        this.user_mail=user_mail;
        this.user_fans=user_fans;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public Integer getUser_fans() {
        return user_fans;
    }

    public void setUser_fans(Integer user_fans) {
        this.user_fans = user_fans;
    }
}
