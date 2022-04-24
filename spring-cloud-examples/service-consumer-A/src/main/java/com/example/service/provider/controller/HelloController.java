package com.example.service.provider.controller;

import com.example.service.provider.feignclients.HelloApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class HelloController {

    @Resource
    HelloApiService helloApiService;

    @GetMapping("/hello")
    public String hello(String name) {
        log.info("Consumer Hello ");
        return helloApiService.hello("Im Consumer," + name);
    }


}
