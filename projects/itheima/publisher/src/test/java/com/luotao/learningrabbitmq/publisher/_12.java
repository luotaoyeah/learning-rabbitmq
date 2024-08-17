package com.luotao.learningrabbitmq.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class _12 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void _01() {
        rabbitTemplate.convertAndSend("luotao.topic", "china.weather", "china.weather");
    }

    @Test
    void _02() {
        rabbitTemplate.convertAndSend("luotao.topic", "china.news", "china.news");
    }

    @Test
    void _03() {
        rabbitTemplate.convertAndSend("luotao.topic", "us.weather", "us.weather");
    }

    @Test
    void _04() {
        rabbitTemplate.convertAndSend("luotao.topic", "us.news", "us.news");
    }
}
