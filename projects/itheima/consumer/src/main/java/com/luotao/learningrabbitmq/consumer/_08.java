package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class _08 {

    @RabbitListener(queues = "simple.queue")
    public void _01(String message) {
        System.out.println("_08._01(): " + message);
    }
}
