package com.lcc.myproject.sqlprovide;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
import org.apache.ibatis.jdbc.SQL;

public class UserTestProvide {

    public String getAllUsers() {
        return new SQL() {{
            this.SELECT("*").FROM("user_test");
        }}.toString();
    }
}
