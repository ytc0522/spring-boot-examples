package com.example.demo.consumer;

import com.example.demo.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = Constants.HELLO_WORLD_QUEUE)
public class RabbitMqConsumer {


    @RabbitHandler
    public void process(String msg) {
        log.info("成功消费消息：" + msg);
    }


}
