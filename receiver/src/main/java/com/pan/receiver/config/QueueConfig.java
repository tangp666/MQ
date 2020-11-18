package com.pan.receiver.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列配置
 *
 * @author tangpan
 * @date 2020-11-18 13:59
 */
@Configuration
public class QueueConfig {

    //邮件队列
    public static final String QUEUE_INFORM_EMAIL = "queue_inform_email";
    //短信队列
    public static final String QUEUE_INFORM_SMS = "queue_inform_sms";

    @Bean(QUEUE_INFORM_EMAIL)
    public Queue QUEUE_INFORM_EMAIL(){
        return new Queue(QUEUE_INFORM_EMAIL);
    }

    @Bean(QUEUE_INFORM_SMS)
    public Queue QUEUE_INFORM_SMS(){
        return new Queue(QUEUE_INFORM_SMS);
    }

}
