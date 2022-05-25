package com.example.dubbo.service.base;

public interface ProviderService {

    void insert();

    void get();

    /**
     * 调用超时测试
     */
    String timeoutTest();

    Integer exceptionTest();


}
