package com.example.demo.producer;

import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.MD5;
import com.example.demo.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.text.DateFormat;
import java.util.Date;

@Slf4j
@Component
public class RabbitMqProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void sendMsg() {

        String msg = "Simple-Hello-World;" + new Date().toString();
        this.rabbitTemplate.convertAndSend(Constants.HELLO_WORLD_QUEUE, msg);
        log.info("发送消息成功,队列：{}，消息：{}", Constants.HELLO_WORLD_QUEUE, msg);
    }


}
