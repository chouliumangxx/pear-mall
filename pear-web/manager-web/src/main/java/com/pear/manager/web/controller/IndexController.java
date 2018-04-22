package com.pear.manager.web.controller;

import com.pear.common.web.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 首页controller
 * create by cx is 2018/4/20
 */
public class IndexController extends BaseController {

    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }
}
