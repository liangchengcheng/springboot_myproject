package com.lcc.myproject.controller;

import com.github.pagehelper.PageHelper;
import com.lcc.myproject.domain.City;
import com.lcc.myproject.domain.UserTest;
import com.lcc.myproject.service.CityService;
import com.lcc.myproject.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liangchengcheng on 2017/7/13.
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private UserTestService userService;

    @RequestMapping("/city/getCity")
    public List<City> getCity() {
        PageHelper.startPage(1, 3);
        return this.cityService.findByState("CA");
    }

    @RequestMapping("/user/getUsers")
    public List<UserTest> getAllUsers() {
        PageHelper.startPage(1, 3);
        return this.userService.getAllUsers();
    }
}
