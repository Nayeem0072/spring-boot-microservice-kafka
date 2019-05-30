package com.jcombat.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMsgSender {
    @Autowired
    private Sender sender;
    @RequestMapping("/kafka/send")
    public String testSend() throws Exception {
        sender.send("Hello Spring Kafka!");
        return "Message sent";
    }

}