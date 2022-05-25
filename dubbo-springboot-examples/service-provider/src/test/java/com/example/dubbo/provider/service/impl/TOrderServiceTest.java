package com.example.dubbo.provider.service.impl;

import com.example.dubbo.base.domain.TOrder;
import com.example.dubbo.base.service.TOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TOrderServiceTest {

    @Resource
    private TOrderService tOrderService;


    @Test
    public void testQuery(){
        List<TOrder> list = tOrderService.lambdaQuery().list();
        System.out.println("list = " + list);
    }



}
