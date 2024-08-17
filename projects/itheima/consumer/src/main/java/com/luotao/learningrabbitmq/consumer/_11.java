package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// direct 类型的 exchange, 会根据 routing key 匹配 queue, 不匹配的 queue 不会收到消息,
@Component
public class _11 {

    @RabbitListener(queues = "direct.queue1")
    public void _01(String message) {
        System.out.println(Thread.currentThread().getId() + " | _11._01() | " + message);
    }

    @RabbitListener(queues = "direct.queue2")
    public void _02(String message) {
        System.err.println(Thread.currentThread().getId() + " | _11._02() | " + message);
    }
}
