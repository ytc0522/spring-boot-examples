package com.example.dubbo.consumer.controller;

import com.example.dubbo.service.base.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private ProviderService providerService;

    @GetMapping("/insert")
    public String insertTest() {
        providerService.insert();
        return "success";
    }

}
