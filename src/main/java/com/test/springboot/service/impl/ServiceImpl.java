package com.test.springboot.service.impl;

import com.test.springboot.service.IService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 */
@Service
public class ServiceImpl implements IService {

    /**
     * say hello方法
     * @return
     */
    public String hello() {
        return "Hello";
    }

    public String hello(String user) {
        System.out.print("user : " + user);
        return user + "say hello";

    }
}
