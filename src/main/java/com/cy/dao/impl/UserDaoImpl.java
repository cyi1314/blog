package com.cy.dao.impl;

import com.cy.dao.BaseDao;
import com.cy.dao.UserDao;
import com.cy.pojo.User;

import java.util.List;


public class UserDaoImpl extends BaseDao implements UserDao{

    @Override
    public User queryUserByUsername(String user_name) {
        String sql="select `user_id`,`user_name`,`user_password`,`user_gender`," +
                "`user_mail`,`user_fans`from user where user_name=? ";
        return queryForOne(User.class,sql,user_name);
    }

    @Override
    public User queryUserByUsernameAndPassword(String user_name, String user_password) {
        String sql="select `user_id`,`user_name`,`user_password`,`user_gender`," +
                "`user_mail`,`user_fans`from user where user_name=? and user_password =? ";
        return queryForOne(User.class,sql,user_name,user_password);
    }

    @Override
    public int saveUser(User user_info) {
        String sql = "insert into user(`user_name`,`user_password`,`user_gender`,`user_mail`,`user_fans`)" +
                " values(?,?,?,?,?)";
        return update(sql,user_info.getUser_name(),user_info.getUser_password(),user_info.getUser_gender()
        ,user_info.getUser_mail(),user_info.getUser_fans());
    }

    @Override
    public List<User> queryUsers() {
        String sql = "select `user_id`,`user_name`,`user_password`,`user_gender`," +
                "`user_mail`,`user_fans`from user";
        return queryForList(User.class,sql);
    }

    @Override
    public User queryUserByUserId(Integer user_id) {
        String sql = "select `user_id`,`user_name`,`user_password`,`user_gender`," +
                "`user_mail`,`user_fans`from user where user_id=? ";
        return queryForOne(User.class,sql,user_id);
    }

    @Override
    public int deleteUserById(Integer user_id) {
        String sql =  "delete from user where user_id=?";
        return update(sql,user_id);
    }

}
