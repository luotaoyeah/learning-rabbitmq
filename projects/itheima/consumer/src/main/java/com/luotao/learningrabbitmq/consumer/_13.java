package com.luotao.learningrabbitmq.consumer;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 通过 bean 的方式定义 exchange, queue, binding,
@Configuration
public class _13 {

    @Bean
    public FanoutExchange fanoutExchange03() {
        return new FanoutExchange("luotao.fanout03");
    }

    @Bean
    public Queue fanoutQueue03() {
        return QueueBuilder.durable("fanout.queue03").build();
    }

    @Bean
    public Binding fanoutBinding03(FanoutExchange fanoutExchange03, Queue fanoutQueue03) {
        return BindingBuilder.bind(fanoutQueue03).to(fanoutExchange03);
    }
}
