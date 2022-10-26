package com.cy.service;

import com.cy.pojo.Admin;

import java.util.List;

public interface AdminService {

    /**
     * 注册管理员
     * @param admin
     */
    public void registAdmin(Admin admin);

    /**
     * 登录
     * @param admin
     * @return 如果返回null，说明登录失败，返回有值，说明登录成功
     */
    public Admin login(Admin admin);

    /**
     * 检查管理员是否可用
     * @param admin_name
     * @return 返回true表示管理员已存在，返回false表示管理员名可用
     */
    public boolean existAdminname(String admin_name);

    /**
     * 检查用户ID是否可用
     * @param admin_id
     * @return 返回true表示用户ID已存在
     */
    public boolean existAdminId(Integer admin_id);

    public List<Admin> queryAdmins();
}
