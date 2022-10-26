package com.cy.test;

import com.cy.dao.AdminDao;
import com.cy.dao.UserDao;
import com.cy.dao.impl.AdminDaoImpl;
import com.cy.dao.impl.UserDaoImpl;
import com.cy.pojo.Admin;
import com.cy.pojo.User;
import org.junit.jupiter.api.Test;

public class AdminDaoImplTest {

    AdminDao adminDao = new AdminDaoImpl();

    @Test
    public void queryAdminByAdminname() {
        if(adminDao.queryAdminByAdminname("jzh")==null){
            System.out.println("管理员名可用！");
        }else {
            System.out.println("管理员名已存在！");
        }
    }

    @Test
    public void queryAdminByAdminnameAndPassword() {
        if(adminDao.queryAdminByAdminnameAndPassword("zj","1335")==null){
            System.out.println("管理员名或密码错误，登录失败！");
        }else {
            System.out.println("查询成功！");
        }
    }

    @Test
    public void saveAdmin() {
        System.out.println(adminDao.saveAdmin(new Admin(null,"zj","1335")));
    }

    @Test
    public void queryAdmins() {
        for (Admin queryAdmin : adminDao.queryAdmins()) {
            System.out.println(queryAdmin);
        }
    }

    @Test
    public void queryAdminByAdminId() {
        if(adminDao.queryAdminByAdminId(1)==null){
            System.out.println("管理员ID可用");
        }else {
            System.out.println("管理员ID已存在");
        }
    }

}