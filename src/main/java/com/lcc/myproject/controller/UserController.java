package com.lcc.myproject.controller;

import com.lcc.myproject.domain.City;
import com.lcc.myproject.service.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangchengcheng on 2017/7/13.
 */
@RestController
public class UserController {

    @Autowired
    private Sender sender;

    public String home() throws Exception{
        this.sender.send();
        City city = new City();
        city.setId(111L);
        city.setName("name-city");
        city.setState("sss");
        city.setCountry("country===");
        this.sender.send(city);
        return "home";
    }

    @RequestMapping("/user/list")
    public List<String> listUser(){
        List<String> list = new ArrayList<String>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");

        return list;
    }
}
