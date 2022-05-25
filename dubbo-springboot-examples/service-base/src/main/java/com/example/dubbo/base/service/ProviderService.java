package com.example.dubbo.base.service;

public interface ProviderService {

    void insert();

    void get();

    /**
     * 调用超时测试
     */
    String timeoutTest();

    Integer exceptionTest();


}
