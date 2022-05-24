package com.example.redis.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
public class RedissonTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 操作字符串
     */
    @Test
    public void testOptString() {
        String key = "myKey";
        String val = "myVal";
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set(key, val, 20, TimeUnit.SECONDS);
        String result = operations.get(key);
        // 获取过期时间
        Long expired = stringRedisTemplate.getExpire(key);
        Boolean hasKey = stringRedisTemplate.hasKey(key);


        // 删除
        Boolean deleted = stringRedisTemplate.delete(key);




        System.out.println("deleted = " + deleted);
        System.out.println("result = " + result);
        log.info("操作完成");
    }


    @Test
    public void testOptHash(){

    }



}
