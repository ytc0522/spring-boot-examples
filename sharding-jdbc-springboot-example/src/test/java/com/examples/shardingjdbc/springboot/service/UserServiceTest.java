package com.examples.shardingjdbc.springboot.service;

import com.examples.shardingjdbc.springboot.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Random;

@Slf4j
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void initData() {
        int count = userService.count();
        if (count == 0) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                UserEntity userEntity = new UserEntity();
                int age = random.nextInt(100);
                userEntity.setAge(age);
                userEntity.setName("tom" + age);
                log.info("插入数据：{}", userEntity);
                userService.save(userEntity);
            }
        }
    }


}
