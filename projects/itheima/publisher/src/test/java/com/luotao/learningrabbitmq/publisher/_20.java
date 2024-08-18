package com.luotao.learningrabbitmq.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class _20 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void _01() throws InterruptedException {
        rabbitTemplate.convertAndSend("luotao.direct", "red", "HELLO");

        Thread.sleep(2000);
    }
}
