package com.example.dubbo.provider.service.impl;

import com.example.dubbo.base.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.TimeUnit;

@Service(version = "1.0", interfaceClass = ProviderService.class, retries = 2)
public class ProviderServiceImpl implements ProviderService {

    @Override
    public void insert() {
        System.out.println("insert...");
    }

    @Override
    public void get() {
        System.out.println("get...");
    }

    @Override
    public String timeoutTest() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout test";
    }

    @Override
    public Integer exceptionTest() {
        System.out.println("RPC方法异常测试...");
        int i = 5 / 0;
        return i;
    }
}
