package org.example.rocketmq.base.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.TimeUnit;

/**
 * 发送单向消息:只管发送，没有返回值
 *
 */
@Slf4j
public class OneWayProducer {


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
            Message message = new Message(topic, tag, ("单向消息" + i).getBytes());
            // 5 发送消息
            producer.sendOneway(message);
            log.info("发送结束！");

            TimeUnit.SECONDS.sleep(1);
        }
        // 6 关闭生产者
        producer.shutdown();

    }

}
