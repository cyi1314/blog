package com.cy.service.impl;

import com.cy.dao.AdminDao;
import com.cy.dao.impl.AdminDaoImpl;
import com.cy.pojo.Admin;
import com.cy.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao=new AdminDaoImpl();

    @Override
    public void registAdmin(Admin admin) {
        adminDao.saveAdmin(admin);
    }

    @Override
    public Admin login(Admin admin) {
        return adminDao.queryAdminByAdminnameAndPassword(admin.getAdmin_name(),admin.getAdmin_password());
    }

    @Override
    public boolean existAdminname(String admin_name) {
        if(adminDao.queryAdminByAdminname(admin_name)==null){
            //等于null表示可用
            return false;
        }
        return true;
    }

    @Override
    public boolean existAdminId(Integer admin_id) {
        if(adminDao.queryAdminByAdminId(admin_id)==null){
            //等于null表示可用
            return false;
        }
        return true;
    }

    @Override
    public List<Admin> queryAdmins() {
        return adminDao.queryAdmins();
    }
}
