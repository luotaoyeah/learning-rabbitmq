package com.luotao.learningrabbitmq.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class _09 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void _01() throws InterruptedException {
        for (int i = 1; i <= 50; i++) {
            rabbitTemplate.convertAndSend("work.queue", "MESSAGE_" + i);
            Thread.sleep(20);
        }
    }
}
