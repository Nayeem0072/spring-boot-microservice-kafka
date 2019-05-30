package com.jcombat.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

public class TestMsgReceiver {
    static final String HELLOWORLD_TOPIC = "helloworld.t";

    @Autowired
    private Receiver receiver;

    @KafkaListener(topics = HELLOWORLD_TOPIC)
    public void testReceive() throws Exception {
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        System.out.println("Received.");
    }

}