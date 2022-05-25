package com.example.dubbo.consumer.controller;

import com.example.dubbo.base.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    /**
     * 服务屏蔽：是调用方法，强制直接返回null；
     * mock = "force:return null"
     */
    @Reference(version = "1.0", timeout = 4000, loadbalance = "random", mock = "return default_mock_result")
    private ProviderService providerService;

    @GetMapping("/insert")
    public String insertTest() {
        providerService.insert();
        return "success";
    }

    @GetMapping("/timeout")
    public String timeoutTest() {
        return providerService.timeoutTest();
    }

    @GetMapping("/exceptionTest")
    public String exceptionTest() {
        String result = null;
        try {
            result = providerService.exceptionTest() + "";
        } catch (Exception e) {
            result = "catch exception";
            log.error("exceptionTest catch exception", e);
            throw e;
        }
        return result;
    }


}
