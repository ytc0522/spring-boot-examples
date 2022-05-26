package com.example.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dubbo.base.mapper")
@SpringBootApplication
@EnableDubbo
public class DubboProviderApp {


    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class, args);
    }


}
