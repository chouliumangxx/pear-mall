package com.pear.manager.service;

import com.pear.manager.service.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * create by cx is 2018/4/28
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Test
    public void contextLoads() { }

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("33","1231131");
    }

    @Test
    public void testGet(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String o =(String) valueOperations.get("33");
        System.out.println("11111111111111:"+o);
    }
}
