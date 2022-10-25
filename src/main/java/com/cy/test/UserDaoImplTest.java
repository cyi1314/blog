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
}
