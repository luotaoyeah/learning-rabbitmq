package com.luotao.learningrabbitmq.publisher;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class _21 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void _01() {
        rabbitTemplate.convertAndSend("luotao.fanout", "", "HELLO");
    }

    @Test
    void _02() {
        Message message = MessageBuilder.withBody("HELLO 02".getBytes()).setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT).build();
        rabbitTemplate.convertAndSend("luotao.fanout", "", message);
    }
}
