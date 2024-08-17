package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class _09 {

    @RabbitListener(queues = "work.queue")
    public void _01(String message) throws InterruptedException {
        System.out.println(Thread.currentThread().getId() + " | _09._01() | " + message);
        Thread.sleep(20);
    }

    @RabbitListener(queues = "work.queue")
    public void _02(String message) throws InterruptedException {
        System.err.println(Thread.currentThread().getId() + " | _09._02() | " + message);
        Thread.sleep(200);
    }
}
