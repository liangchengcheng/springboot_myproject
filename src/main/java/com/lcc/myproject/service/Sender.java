package com.lcc.myproject.service;

import com.lcc.myproject.domain.City;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    public void send() throws Exception{
        String context = "hello"+ new Date();
        System.out.println("Sender:" + context);
        this.amqpTemplate.convertAndSend("hello",context);
    }

    public void send(City city){
        this.rabbitMessagingTemplate.convertAndSend("hello", city);
    }
}
