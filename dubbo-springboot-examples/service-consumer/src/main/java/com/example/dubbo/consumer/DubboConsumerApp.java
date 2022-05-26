package com.example.dubbo.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dubbo.base.mapper")
public class DubboConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApp.class, args);
    }

}
