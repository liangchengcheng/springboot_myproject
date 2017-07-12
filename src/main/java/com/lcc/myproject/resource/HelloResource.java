package com.lcc.myproject.resource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by liangchengcheng on 2017/7/12.
 */
@ApiModel(description = "Hello 类")
public class HelloResource {

    @ApiModelProperty(value = "消息",required = true)
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
