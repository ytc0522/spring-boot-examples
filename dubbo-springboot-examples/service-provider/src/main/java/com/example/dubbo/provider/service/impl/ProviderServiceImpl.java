package com.example.dubbo.provider.service.impl;

import com.example.dubbo.service.base.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0",interfaceClass = ProviderService.class)
public class ProviderServiceImpl implements ProviderService {

    @Override
    public void insert() {
        System.out.println("insert...");
    }

    @Override
    public void get() {
        System.out.println("get...");
    }
}
