package com.pear.manager.web.api;

import com.pear.common.utils.IdGenUtils;
import com.pear.manager.pojo.SysAdmin;
import com.pear.manager.service.SysAdminService;
import com.pear.manager.web.model.SysAdminModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * create by cx is 2018/4/24
 */
@Controller
@RequestMapping(value = "/api/sysAdmins")
public class SysAdminController {

    @Autowired
    @Qualifier("sysAdminService")
    private SysAdminService sysAdminService;

    @ApiOperation(value="添加用户", notes="")
    @RequestMapping(value = {""},method = RequestMethod.POST)
    public void add(SysAdminModel model){
        SysAdmin entity = new SysAdmin();
        entity.setId(IdGenUtils.getId());
        entity.setPassword(model.getPassword());
        entity.setPhone(model.getPhone());
        try {
            sysAdminService.add(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
