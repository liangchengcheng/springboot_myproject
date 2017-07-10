package com.lcc.myproject.service;

import com.lcc.myproject.domain.City;

import java.util.List;

/**
 * Created by liangchengcheng on 2017/7/11.
 */

public interface CityService {

    List<City> findByState(String state);
}
