package com.jcombat.client;

import java.util.concurrent.CountDownLatch;
import org.springframework.kafka.annotation.KafkaListener;


public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @KafkaListener(topics = "helloworld.t")
    public void receive(String payload) {
        System.out.println("received payload=" + payload);
        latch.countDown();
    }
}