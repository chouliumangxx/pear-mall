package com.pear.manager.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

/**
 * create by cx is 2018/4/20
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.pear.manager.service.impl"},
        includeFilters = {@ComponentScan.Filter(classes = {Service.class})})
@ImportResource(locations = "classpath:/dubbo/dubbo-manager-service.xml")
@MapperScan("com.pear.manager.service.dao")
public class ManagerServiceApplication {
    public static void main(String[]args){
        SpringApplication.run(ManagerServiceApplication.class);
    }
}
