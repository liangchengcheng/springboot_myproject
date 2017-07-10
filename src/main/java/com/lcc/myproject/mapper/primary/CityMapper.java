package com.lcc.myproject.mapper.primary;

import com.lcc.myproject.domain.City;
import com.lcc.myproject.sqlprovide.CitySqlProvide;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
public interface CityMapper {

    @SelectProvider(type = CitySqlProvide.class, method = "findByState")
    List<City> findByState(@Param("state") String state);
}
