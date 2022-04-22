package com.example.demo;

import com.example.demo.producer.RabbitMqProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private RabbitMqProducer producer;

    // 发送单条消息
    @Test
    public void contextLoads() {
        producer.sendMsg();
    }

}
