package com.pan.seader;

import com.pan.seader.sender.TopicsRabbitMQ;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeaderApplicationTests {

    @Autowired
    TopicsRabbitMQ topicsRabbitMQ;

    @Test
    void contextLoads() {
        for (int i=0;i<5;i++){
            topicsRabbitMQ.sendEmile();
        }
    }

    @Test
    void contextLoads2() {
        for (int i=0;i<5;i++){
            topicsRabbitMQ.sendSms();
        }
    }
}
