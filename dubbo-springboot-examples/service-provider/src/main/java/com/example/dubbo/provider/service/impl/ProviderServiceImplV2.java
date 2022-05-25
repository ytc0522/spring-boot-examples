package com.example.dubbo.provider.service.impl;

import com.example.dubbo.base.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "2.0")
public class ProviderServiceImplV2 implements ProviderService {

    @Override
    public void insert() {
        System.out.println("this is v2 insert");
    }

    @Override
    public void get() {

    }

    @Override
    public String timeoutTest() {
        return "timeout test";
    }

    @Override
    public Integer exceptionTest() {
        return -1;
    }
}
