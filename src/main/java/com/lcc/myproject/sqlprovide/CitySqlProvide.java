package com.lcc.myproject.sqlprovide;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
public class CitySqlProvide {
    public String findByState(String state){
        return new SQL(){
            {
                this.SELECT("*").FROM("city").WHERE("state=#{state}");
            }
        }.toString();
    }
}
