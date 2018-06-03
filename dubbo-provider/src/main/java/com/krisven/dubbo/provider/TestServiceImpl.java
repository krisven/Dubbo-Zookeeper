package com.krisven.dubbo.provider;

import com.krisven.dubbo.provider.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
