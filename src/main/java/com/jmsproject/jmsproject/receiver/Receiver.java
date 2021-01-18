package com.jmsproject.jmsproject.receiver;


import com.jmsproject.jmsproject.config.JmsConfig;
import com.jmsproject.jmsproject.model.MessageObject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = JmsConfig.JU19_QUEUE)
    public void listen(@Payload MessageObject messageObject) {
        System.out.println("I got a message");
        System.out.println(messageObject);
    }

}
