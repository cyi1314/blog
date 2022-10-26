package com.cy.service.impl;

import com.cy.dao.UserDao;
import com.cy.dao.impl.UserDaoImpl;
import com.cy.pojo.User;
import com.cy.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();

    public void registUser(User user) {
        userDao.saveUser(user);
    }

    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUser_name(),user.getUser_password());
    }

    public boolean existUsername(String username) {
        if(userDao.queryUserByUsername(username)==null){
            //等于null表示可用
            return false;
        }
        return true;
    }

    public boolean existUserId(Integer user_id) {
        if(userDao.queryUserByUserId(user_id)==null){
            //等于null表示可用
            return false;
        }
        return true;
    }

    public List<User> queryUsers() {
        return userDao.queryUsers();
    }

    @Override
    public void deleteUserById(Integer user_id) {
        userDao.deleteUserById(user_id);
    }
}
