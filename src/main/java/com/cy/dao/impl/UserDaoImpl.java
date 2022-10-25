package com.cy.dao.impl;

import com.cy.dao.BaseDao;
import com.cy.dao.UserDao;
import com.cy.pojo.User;

import java.util.List;


public class UserDaoImpl extends BaseDao implements UserDao{

    @Override
    public User queryUserByUsername(String user_name) {
        return null;
    }

    @Override
    public User queryUserByUsernameAndPassword(String user_name, String user_password) {
        return null;
    }

    @Override
    public int saveUser(User user) {
        return 0;
    }

    @Override
    public List<User> queryUsers() {
        return null;
    }

    @Override
    public User queryUserByUserId(Integer user_id) {
        return null;
    }
}
