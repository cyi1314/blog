package com.cy.service;

import com.cy.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     * @return 如果返回null，说明登录失败，返回有值，说明登录成功
     */
    public User login(User user);

    /**
     * 检查用户是否可用
     * @param username
     * @return 返回true表示用户名已存在，返回false表示用户名可用
     */
    public boolean existUsername(String username);

    /**
     * 检查用户ID是否可用
     * @param user_id
     * @return 返回true表示用户ID已存在
     */
    public boolean existUserId(Integer user_id);

    public List<User> queryUsers();

}
