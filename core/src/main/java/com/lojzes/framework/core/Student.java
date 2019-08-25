package com.lojzes.framework.core;

import org.springframework.stereotype.Component;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2019/8/25 0025 21:18
 */
//@Component("st1")
public class Student {

    private String address;

    public Student(String address) {
        this.address = address;
    }

    public Student() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
