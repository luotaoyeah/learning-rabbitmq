package com.luotao.learningrabbitmq.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class _10 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void _01() {
        rabbitTemplate.convertAndSend("luotao.fanout", "", "MESSAGE:FANOUT");
    }
}
