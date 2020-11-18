package com.pan.seader.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 交换机和队列绑定
 *
 * @author tangpan
 * @date 2020-11-18 14:03
 */
@Configuration
public class RabbitMqConfig {

    public static final String ROUTINGKEY_EMAIL="inform.#.email.#";
    public static final String ROUTINGKEY_SMS="inform.#.sms.#";

    @Autowired
    ExchangeConfig exchangeConfig;
    @Autowired
    QueueConfig queueConfig;

    //交换机指定routingKey ROUTINGKEY_EMAIL
    @Bean
    public Binding BINDING_QUEUE_INFORM_EMAIL(){
        return BindingBuilder.bind(queueConfig.QUEUE_INFORM_EMAIL()).to(exchangeConfig.EXCHANGE_TOPICS_INFORM()).with(ROUTINGKEY_EMAIL).noargs();
    }
    //交换机指定routingKey ROUTINGKEY_SMS
    @Bean
    public Binding BINDING_QUEUE_INFORM_SMS(){
        return BindingBuilder.bind(queueConfig.QUEUE_INFORM_SMS()).to(exchangeConfig.EXCHANGE_TOPICS_INFORM()).with(ROUTINGKEY_SMS).noargs();
    }
}
