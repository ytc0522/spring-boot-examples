package com.examples.shardingjdbc.springboot;

import org.apache.shardingsphere.core.config.DataSourceConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.examples.shardingjdbc.springboot.dao")
@SpringBootApplication()
public class ShardingJDBCApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCApp.class, args);
    }


}
