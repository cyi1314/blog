package com.cy.test;

import com.cy.pojo.User;
import com.cy.service.UserService;
import com.cy.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

public class UserServiceImplTest {

    UserService userService = new UserServiceImpl();

    @Test
    void registUser() {
        userService.registUser(new User(null,"yy","1111","male","1234@163.com",null));
    }

    @Test
    void login() {
        User user =new User(null,"cy","86363145",null,null,null);
        System.out.println("id:"+userService.login(user).getUser_id()+" gender:"+userService.login(user).getUser_gender());
    }

    @Test
    void existUsername() {
        if(userService.existUsername("zj")){
            System.out.println("用户名已存在！");
        }else {
            System.out.println("用户名可用！");
        }
    }
    @Test
    void queryUsers(){
        for (User queryUser : userService.queryUsers()) {
            System.out.println(queryUser);
        }
    }

    @Test
    void existUserId(){
        if(userService.existUserId(23)){
            System.out.println("用户名已存在！");
        }else {
            System.out.println("用户名可用！");
        }
    }

    @Test
    void deleteUserById(){
        userService.deleteUserById(5);
    }
}
