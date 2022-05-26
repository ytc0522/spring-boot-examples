package com.example.dubbo.consumer.controller;

import com.example.dubbo.base.service.TOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/seata")
public class SeataTestController {

    @Resource
    private TOrderService tOrderService;

    @GetMapping("/createOrder")
    public String createOrder(Integer count, String code) {
        tOrderService.createOrder(count,code);
        return "ok";
    }


}
