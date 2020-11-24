package com.test.springboot.service.impl;

import com.test.springboot.service.IService;

public class Test {
    private IService iservice = null;

    public void init() {
        iservice = new ServiceImpl();
    }
    public static void main(String[] args) {

    }

    public void test(String user) {
        iservice.hello(user);
    }
}
