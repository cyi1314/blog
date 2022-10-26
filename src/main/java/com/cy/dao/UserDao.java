package com.cy.dao;

import com.cy.pojo.User;

import java.util.List;

public interface UserDao {

    /**
     * 根据用户名查询用户信息
     * @param user_name 用户名
     * @return 如果返回null，说明没有这个用户；反之亦然
     */
    public User queryUserByUsername(String user_name);

    /**
     * 根据用户名和密码查询用户信息
     * @param user_name 用户名
     * @param user_password 密码
     * @return 如果返回null，说明用户名或密码错误；反之亦然
     */
    public User queryUserByUsernameAndPassword(String user_name, String user_password);

    /**
     * 保存用户信息
     * @param user 用户
     * @return 返回-1表示失败,其他为sql语句影响的行数
     */
    public int saveUser(User user);

    public List<User> queryUsers();

    public User queryUserByUserId(Integer user_id);

    public  int deleteUserById(Integer user_id);
}
