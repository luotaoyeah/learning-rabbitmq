package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// 通过 @RabbitListener 注解来定义 exchange, queue, binding,
@Component
public class _14 {

    @RabbitListener(
        bindings = @QueueBinding(
            value = @Queue(name = "luotao.queue01"),
            exchange = @Exchange(name = "luotao.exchange.direct01", type = ExchangeTypes.DIRECT),
            key = { "red", "blue" }
        )
    )
    public void _01(String message) {}
}
