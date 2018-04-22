package com.pear.manager.web.controller;

import com.pear.common.utils.IdGenUtils;
import com.pear.common.web.base.controller.BaseController;
import com.pear.manager.service.ManagerAdminService;
import com.pear.manager.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * create by cx is 2018/4/22
 */
@Controller
public class ManagerAdminController extends BaseController {

    @Autowired
    protected ManagerAdminService managerAdminService;

    @RequestMapping("/admin")
    @ResponseBody
    public Admin findById(){
         //managerAdminService.findById();
         Admin admin = new Admin();
         admin.setPhone(IdGenUtils.getId());
        String ii = managerAdminService.findII();
        Admin ad = managerAdminService.findById();
        admin.setPassword(ii);
        return ad;
    }
}
