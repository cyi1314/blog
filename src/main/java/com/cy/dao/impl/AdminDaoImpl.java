package com.cy.dao.impl;

import com.cy.dao.AdminDao;
import com.cy.dao.BaseDao;
import com.cy.pojo.Admin;
import com.cy.pojo.User;

import java.util.List;

public class AdminDaoImpl extends BaseDao implements AdminDao {
    @Override
    public Admin queryAdminByAdminname(String admin_name) {
        String sql = "select * from admin where admin_name = ?";
        return queryForOne(Admin.class,sql,admin_name);
    }

    @Override
    public Admin queryAdminByAdminnameAndPassword(String admin_name, String admin_password) {
        String sql = "select * from admin where admin_name = ? and admin_password = ?";
        return queryForOne(Admin.class,sql,admin_name,admin_password);
    }

    @Override
    public int saveAdmin(Admin admin) {
        String sql = "insert into admin(`admin_name`,`admin_password`) values (?,?)";
        return update(sql,admin.getAdmin_name(),admin.getAdmin_password());
    }

    @Override
    public List<Admin> queryAdmins() {
        String sql = "select `admin_id`,`admin_name`,`admin_password` from admin";
        return queryForList(Admin.class,sql);
    }

    @Override
    public Admin queryAdminByAdminId(Integer admin_id) {
        String sql = "select * from admin where admin_id = ?";
        return queryForOne(Admin.class,sql,admin_id);
    }

}
