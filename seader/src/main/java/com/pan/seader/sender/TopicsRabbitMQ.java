package com.pan.seader.sender;

import com.pan.seader.config.ExchangeConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 路由mq 发送消息
 *
 * @author tangpan
 * @date 2020-11-18 14:27
 */
@Service
public class TopicsRabbitMQ {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendEmile(){
        rabbitTemplate.convertAndSend(ExchangeConfig.EXCHANGE_TOPICS_INFORM, "inform.email", "send Emails to user");
    }

    public void sendSms(){
        rabbitTemplate.convertAndSend(ExchangeConfig.EXCHANGE_TOPICS_INFORM, "inform.sms", "send sms to user");
    }

}
