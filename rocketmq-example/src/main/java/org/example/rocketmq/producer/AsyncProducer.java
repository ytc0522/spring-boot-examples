package org.example.rocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.TimeUnit;

/**
 * 发送异步消息
 * 通常用于对响应时间敏感的业务场景，
 * 发送完消息会不同同步等待mq的响应
 */
@Slf4j
public class AsyncProducer {

    public static void main(String[] args) throws Exception {
        // 1 创建消息生产者
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        // 2 指定nameServer地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        // 3 启动producer
        producer.start();
        // 4 创建消息对象，指定topic tag和消息体
        String topic = "base";
        // 指定tag
        String tag = "tag1";
        for (int i = 0; i < 10; i++) {
            Message message = new Message(topic, tag, ("hello World" + i).getBytes());
            // 5 发送异步消息
            producer.send(message, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    log.info("发送SUCCESS,{}", sendResult);
                }

                @Override
                public void onException(Throwable throwable) {
                    log.error("发送异常", throwable);
                }
            });
            TimeUnit.SECONDS.sleep(1);
        }
        // 6 关闭生产者
        producer.shutdown();

    }

}
