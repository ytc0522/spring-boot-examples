package com.example.redis.spring.boot;


import org.junit.jupiter.api.Test;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedissonExampleTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    public void testSet(){
        RBucket<Object> bucket = redissonClient.getBucket("hello");
        bucket.set("world");


        String hello = (String)redissonClient.getBucket("hello").get();
        System.out.println("hello = " + hello);
    }




}
