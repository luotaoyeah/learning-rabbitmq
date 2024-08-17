package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class _10 {

    @RabbitListener(queues = "fanout.queue1")
    public void _01(String message) {
        System.out.println(Thread.currentThread().getId() + " | _10._01() | " + message);
    }

    @RabbitListener(queues = "fanout.queue2")
    public void _02(String message) {
        System.err.println(Thread.currentThread().getId() + " | _10._02() | " + message);
    }
}
