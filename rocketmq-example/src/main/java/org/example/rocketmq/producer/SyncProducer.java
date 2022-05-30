package org.example.rocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.TimeUnit;

/**
 * 发送同步消息
 */
@Slf4j
public class SyncProducer {


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
            // 5 发送消息
            SendResult result = producer.send(message);
            SendStatus sendStatus = result.getSendStatus();
            String msgId = result.getMsgId();
            int queueId = result.getMessageQueue().getQueueId();
            log.info("发送状态:{},消息Id:{},队列：{}", sendStatus, msgId, queueId);

            TimeUnit.SECONDS.sleep(1);
        }
        // 6 关闭生产者
        producer.shutdown();

    }

}
