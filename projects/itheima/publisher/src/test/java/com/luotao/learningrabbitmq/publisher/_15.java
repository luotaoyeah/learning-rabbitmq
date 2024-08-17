package com.luotao.learningrabbitmq.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class _15 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // 对象类型的消息的序列化,
    @Test
    void _01() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "LUOTAO");
        map.put("age", 18);
        rabbitTemplate.convertAndSend("luotao.exchange1501", "", map);
    }
}
