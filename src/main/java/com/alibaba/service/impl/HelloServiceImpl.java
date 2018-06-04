package com.alibaba.service.impl;

import com.alibaba.service.HelloWorldService;

/**
 * @author:xueshufeng
 * @date:18-6-3
 */
public class HelloServiceImpl implements HelloWorldService {
    @Override
    public String sayhello(String name) {
        return "hello good afternoon" +name;
    }


}
