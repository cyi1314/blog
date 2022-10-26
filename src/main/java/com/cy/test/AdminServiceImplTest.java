package com.cy.test;

import com.cy.pojo.Admin;
import com.cy.pojo.User;
import com.cy.service.AdminService;
import com.cy.service.impl.AdminServiceImpl;
import org.junit.Test;

public class AdminServiceImplTest {

    AdminService adminService = new AdminServiceImpl();

    @Test
    public void registAdmin() {
        adminService.registAdmin(new Admin(null,"jzh1","666"));
    }

    @Test
    public void login() {
        Admin admin =new Admin(null,"jzh2","666");
        System.out.println("id:"+adminService.login(admin).getAdmin_id()+" name:"+adminService.login(admin).getAdmin_name());
    }

    @Test
    public void existAdminname() {
        if(adminService.existAdminname("zj")){
            System.out.println("管理员已存在！");
        }else {
            System.out.println("管理员名可用！");
        }
    }

    @Test
    public void existAdminId() {
        if(adminService.existAdminId(2)){
            System.out.println("管理员已存在！");
        }else {
            System.out.println("管理员可用！");
        }
    }

    @Test
    public void queryAdmins() {
        for (Admin queryAdmin : adminService.queryAdmins()) {
            System.out.println(queryAdmin);
        }
    }
}