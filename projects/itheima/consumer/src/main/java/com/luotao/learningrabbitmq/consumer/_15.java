package com.luotao.learningrabbitmq.consumer;

import java.util.Map;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class _15 {

    @RabbitListener(
        bindings = @QueueBinding(value = @Queue(name = "luotao.queue1501"), exchange = @Exchange(name = "luotao.exchange1501", type = ExchangeTypes.FANOUT))
    )
    public void _01(Map<String, Object> message) {
        System.err.println(Thread.currentThread().getId() + " | _15._01() | " + message);
    }
}
