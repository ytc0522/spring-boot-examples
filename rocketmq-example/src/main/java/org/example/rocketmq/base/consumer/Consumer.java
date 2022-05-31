package org.example.rocketmq.base.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;

import java.util.List;

/**
 * 消息消费者
 */
@Slf4j
public class Consumer {


    public static void main(String[] args) throws Exception {

        //1 创建消费者，指定消费者组
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group1");
        // 2 指定namserver 地址
        consumer.setNamesrvAddr("127.0.0.1:9876");
        // 设置消费模式 默认是负载均衡模式，可指定为广播模式
        consumer.setMessageModel(MessageModel.BROADCASTING);

        //3 订阅topic和tag
        String topic = "base";
        // tag 表达式
        String tagExpress = "tag1";
        consumer.subscribe(topic, tagExpress);
        // 4 设置回调函数
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgList, ConsumeConcurrentlyContext context) {
                // 接受消息
                for (MessageExt messageExt : msgList) {
                    //log.info("接收到消息：{}", messageExt);
                    log.info("消息Body：{}", new String(messageExt.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        // 5 启动消费者
        consumer.start();
        log.info("消费者已经启动!");
    }


}
