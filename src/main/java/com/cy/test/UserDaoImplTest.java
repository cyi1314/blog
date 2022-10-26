package com.cy.test;

import com.cy.dao.UserDao;
import com.cy.dao.impl.UserDaoImpl;
import com.cy.pojo.User;
import org.junit.jupiter.api.Test;

public class UserDaoImplTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    void queryUserByUsername(){
        if(userDao.queryUserByUsername("cy")==null){
            System.out.println("用户名可用！");
        }else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("cy","86363145")==null){
            System.out.println("用户名或密码错误，登录失败！");
        }else {
            System.out.println("查询成功！");
        }
    }

    @Test
    void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"dc","8744","female","12356@163.com",0)));
    }

    @Test
    void queryUsers(){
        for (User queryUser : userDao.queryUsers()) {
            System.out.println(queryUser);
        }
    }

    @Test
    void queryUserByUserId(){
        if(userDao.queryUserByUserId(1)==null){
            System.out.println("用户ID可用");
        }else {
            System.out.println("用户ID已存在");
        }
    }
    @Test
    void deleteUserById(){
        userDao.deleteUserById(6);
    }
}
