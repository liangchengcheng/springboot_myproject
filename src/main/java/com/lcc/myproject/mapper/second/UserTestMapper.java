package com.lcc.myproject.mapper.second;

import java.util.List;

import com.lcc.myproject.domain.UserTest;
import com.lcc.myproject.sqlprovide.UserTestProvide;
import org.apache.ibatis.annotations.SelectProvider;

public interface UserTestMapper {

    @SelectProvider(type = UserTestProvide.class, method = "getAllUsers")
    List<UserTest> getAllUsers();
}

