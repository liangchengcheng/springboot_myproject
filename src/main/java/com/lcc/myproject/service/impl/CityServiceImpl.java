package com.lcc.myproject.service.impl;

import com.lcc.myproject.domain.City;
import com.lcc.myproject.mapper.primary.CityMapper;
import com.lcc.myproject.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    @Transactional(value = "primaryTxMan", readOnly = true)
    public List<City> findByState(String state) {
        return this.cityMapper.findByState(state);
    }
}
