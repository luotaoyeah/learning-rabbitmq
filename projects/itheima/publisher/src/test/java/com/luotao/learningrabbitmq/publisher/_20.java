package com.luotao.learningrabbitmq.publisher;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@SpringBootTest
class _20 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void _01() throws InterruptedException {
        rabbitTemplate.convertAndSend("luotao.direct", "red", "HELLO");

        Thread.sleep(2000);
    }

    @Test
    void _02() throws InterruptedException {
        CorrelationData correlationData = new CorrelationData();

        correlationData
            .getFuture()
            .addCallback(
                new ListenableFutureCallback<CorrelationData.Confirm>() {
                    @Override
                    public void onFailure(Throwable ex) {
                        log.error("_20._02() | onFailure()");
                    }

                    @Override
                    public void onSuccess(CorrelationData.Confirm result) {
                        if (result.isAck()) {
                            log.info("_20._02() |  ACK | {}", result);
                        } else {
                            log.warn("_20._02() | NACK | {}", result);
                        }
                    }
                }
            );

        rabbitTemplate.convertAndSend("luotao.direct2", "black", "HELLO", correlationData);

        Thread.sleep(2000);
    }
}
