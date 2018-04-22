package com.pear.manager.service.impl;

import com.pear.common.utils.IdGenUtils;
import com.pear.manager.service.ManagerAdminService;
import com.pear.manager.pojo.Admin;
import org.springframework.stereotype.Service;

/**
 * create by cx is 2018/4/22
 */
@Service("managerAdminService")
public class ManagerAdminServiceImpl implements ManagerAdminService {


    @Override
    public Admin findById() {
        Admin admin = new Admin();
        admin.setId(IdGenUtils.getId());
        admin.setPassword(IdGenUtils.getId());
        admin.setUsername("天上人间");
        admin.setPhone("15013676150");
        return admin;
    }

    @Override
    public String findII() {
        Admin admin = new Admin();
        admin.setId(IdGenUtils.getId());
        admin.setPassword(IdGenUtils.getId());
        admin.setUsername("天上人间");
        admin.setPhone("15013676150");
        String s = admin.toString();
        return s;
    }
}
