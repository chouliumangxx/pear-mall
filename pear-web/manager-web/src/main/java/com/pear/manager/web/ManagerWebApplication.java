package com.pear.manager.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.Locale;

/**
 * create by cx is 2018/4/18
 */
@SpringBootApplication
@ImportResource(locations ="classpath:/dubbo/dubbo-manager-web.xml")
public class ManagerWebApplication {
    public static void main(String[]args){
        SpringApplication.run(ManagerWebApplication.class);
    }
}
