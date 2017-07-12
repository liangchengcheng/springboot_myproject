package com.lcc.myproject.service.impl;

import com.lcc.myproject.domain.UserTest;
import com.lcc.myproject.mapper.second.UserTestMapper;
import com.lcc.myproject.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
@Service
public class UserTestServiceImpl implements UserTestService{

    @Autowired
    private UserTestMapper userTestMapper;

    @Override
    @Transactional(value = "secondTxMan", readOnly = true)
    public List<UserTest> getAllUsers() {
        return this.userTestMapper.getAllUsers();
    }
}
