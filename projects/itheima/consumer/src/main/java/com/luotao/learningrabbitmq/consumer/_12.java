package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// topic 类型的 exchange, 跟 direct 类型的 exchange 一样, 也会根据 routing key 匹配 queue, 但是它的 routing key 支持通配符,
// 发送消息的时候, routing key 中通过点(.)分隔多个单词,
// 定义绑定的时候, routing key 中可以包含两种通配符, # 代表任意多个单词, * 代表一个单词,
@Component
public class _12 {

    // china.#
    @RabbitListener(queues = "topic.queue1")
    public void _01(String message) {
        System.out.println(Thread.currentThread().getId() + " | _12._01() | " + message);
    }

    // #.weather
    @RabbitListener(queues = "topic.queue2")
    public void _02(String message) {
        System.err.println(Thread.currentThread().getId() + " | _12._02() | " + message);
    }
}
