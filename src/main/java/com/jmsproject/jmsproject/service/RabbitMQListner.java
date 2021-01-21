package com.jmsproject.jmsproject.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class RabbitMQListner implements MessageListener{

    public void onMessage(Message message) {
        System.out.println("Consuming Message - " + new String(message.getBody()));
        File file = new File("log.txt");

        try {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(new String(message.getBody()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
