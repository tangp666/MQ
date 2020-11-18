package com.pan.receiver.recevier;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *  mq服务接收
 *
 * @author tangpan
 * @date 2020-11-18 14:50
 */
@Component
public class ReceiveHandler {

    @RabbitListener(queues = {"queue_inform_email"}, containerFactory = "rabbitListenerContainerFactory")
    public void handleEmailsMessage(String message){
        // 处理消息
        System.out.println("queue_inform_email {} handleMessage :"+message);
    }

    @RabbitListener(queues = {"queue_inform_sms"}, containerFactory = "rabbitListenerContainerFactory")
    public void handleSmsMessage(String message){
        // 处理消息
        System.out.println("queue_inform_email {} handleMessage :"+message);
    }
}
