package com.lcc.myproject.domain;

import java.io.Serializable;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
public class UserTest implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6075844282964984795L;

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
