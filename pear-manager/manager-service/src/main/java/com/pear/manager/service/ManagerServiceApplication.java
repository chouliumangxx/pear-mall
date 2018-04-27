package com.pear.manager.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * create by cx is 2018/4/20
 */
@SpringBootApplication
@ImportResource(locations = "classpath:/dubbo/dubbo-manager-service.xml")
public class ManagerServiceApplication {
    public static void main(String[]args){
        SpringApplication.run(ManagerServiceApplication.class);
    }
}
