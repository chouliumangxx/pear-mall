package com.pear.manager.service.impl;

import com.pear.manager.dao.SysAdminDao;
import com.pear.manager.pojo.SysAdmin;
import com.pear.manager.service.SysAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by cx is 2018/4/24
 */
@Service("sysAdminService")
public class SysAdminServiceImpl implements SysAdminService {

    @Autowired
    private SysAdminDao sysAdminDao;

    @Override
    public void add(SysAdmin entity) throws Exception {
        sysAdminDao.insertSysAdmin(entity);
    }
}
