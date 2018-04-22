package com.pear.common.utils;

import java.util.UUID;

/**
 * id生成工具
 * create by cx is 2018/4/22
 */
public class IdGenUtils {
    private IdGenUtils(){};

    public static String getId(){
        return UUID.randomUUID().toString().replace("-", "");
    }
    public static void main(String[]args){
        System.out.println(getId());
    }
}
