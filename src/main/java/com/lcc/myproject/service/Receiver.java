package com.lcc.myproject.service;

import com.google.gson.Gson;
import com.lcc.myproject.domain.City;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
@Component
public class Receiver {

    public void process(String hello){
        System.out.println("receiver:"+hello);
    }

    /**
     * 注释掉不监听rabbit队列
     */
    @RabbitListener(queues = "hello")
    public void process(City city){
        System.out.println("city.name===[" + city.getCountry() + "]");
        System.out.println(new Gson().toJson(city));
    }
}
