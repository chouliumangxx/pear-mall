package com.pear.manager.web.api;

import com.pear.manager.pojo.Admin;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * create by cx is 2018/4/23
 */
@RestController
@RequestMapping(value = "/admins")
public class TestSawgger2Controller {

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = {""},method = RequestMethod.GET)
    public List<Admin> getAdminList(){
        List<Admin> admins =new ArrayList<>();
        for(int i=0;i<5;i++){
            Admin admin = new Admin();
            admin.setPassword("password===="+i);
            admin.setPhone("phone====="+i);
            admins.add(admin);
        }
        return admins;
    }
}
