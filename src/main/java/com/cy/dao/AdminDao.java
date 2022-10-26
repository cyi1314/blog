package com.cy.dao;

import com.cy.pojo.Admin;

import java.util.List;

public interface AdminDao {

    /**
     * 根据管理员名查询管理员信息
     * @param admin_name 管理员名
     * @return 如果返回null，说明没有这个管理员；反之亦然
     */
    public Admin queryAdminByAdminname(String admin_name);

    /**
     * 根据管理员名和密码查询用户信息
     * @param admin_name 管理员名
     * @param admin_password 密码
     * @return 如果返回null，说明管理员名或密码错误；反之亦然
     */
    public Admin queryAdminByAdminnameAndPassword(String admin_name, String admin_password);

    /**
     * 保存管理员信息
     * @param admin 管理员
     * @return 返回-1表示失败,其他为sql语句影响的行数
     */
    public int saveAdmin(Admin admin);

    public List<Admin> queryAdmins();

    public Admin queryAdminByAdminId(Integer admin_id);
}
