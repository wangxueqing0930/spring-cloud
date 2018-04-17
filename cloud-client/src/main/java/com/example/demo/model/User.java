package com.example.demo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/23.
 */
public class User implements Serializable{


    private static final long serialVersionUID = 2927634666507142215L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
