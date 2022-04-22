package com.example.redis.spring.boot.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@Slf4j
@RequestMapping("/redisson")
@RestController
public class RedisExampleController {

    @Autowired
    private RedissonClient redissonClient;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    private final String LOCK = "lock";


    @SneakyThrows
    @GetMapping("/lockAdd")
    public String lockAdd() {
        RLock lock = redissonClient.getLock(LOCK);
        log.info("before lock()");

        try {
            lock.lock();
            log.info("抢到锁：{}", lock.getName());

            String stock = stringRedisTemplate.opsForValue().get("stock");
            if (stock == null) {
                stock = "100";
            }

            log.info("当前库存:{}", stock);
            int stockNum = Integer.parseInt(stock);

            if (stockNum > 0) {
                stockNum -= 1;
                stringRedisTemplate.opsForValue().set("stock", String.valueOf(stockNum));
                Thread.sleep(5000);
            } else {
                log.info("扣减失败，库存不足");
            }

        } finally {
            lock.unlock();
            log.info("释放锁:{}", lock.getName());
        }
        return "OK";

    }


}
