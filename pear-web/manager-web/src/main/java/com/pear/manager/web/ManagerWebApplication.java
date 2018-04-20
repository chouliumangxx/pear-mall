package com.pear.manager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * create by cx is 2018/4/18
 */
@SpringBootApplication
public class ManagerWebApplication {
    public static void main(String[]args){
        SpringApplication.run(ManagerWebApplication.class);
    }
}
