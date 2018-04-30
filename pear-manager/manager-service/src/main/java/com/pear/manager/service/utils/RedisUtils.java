package com.pear.manager.service.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Redis工具类
 * create by cx is 2018/4/28
 */
public class RedisUtils {

    private static final int DEFAULT_BLOCK_TIME = 60;
    private static final String LOCK_KEY = "lock_";
    private static RedisTemplate redisTemplate = SpringUtils.getBean("redisTemplate",RedisTemplate.class);
    @Value("${custom.redis.prefix}")
    private static String redisPrefix;
    public static void setRedisPrefix(String redisPrefix) {
        RedisUtils.redisPrefix = redisPrefix;
    }
    private RedisUtils(){}

}