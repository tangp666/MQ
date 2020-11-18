package com.pan.receiver.config;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 交换机配置
 *
 * @author tangpan
 * @date 2020-11-18 13:50
 */
@Configuration
public class ExchangeConfig {

    public static final String EXCHANGE_TOPICS_INFORM = "exchange_topics_inform";

    @Bean(EXCHANGE_TOPICS_INFORM)
    public Exchange EXCHANGE_TOPICS_INFORM(){
//        durable持久化  mq重启后交换机还存在
        return ExchangeBuilder.topicExchange(EXCHANGE_TOPICS_INFORM).durable(true).build();
    }
}
