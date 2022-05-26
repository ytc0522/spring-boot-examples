package com.example.dubbo.consumer.service.impl.seata;

import com.example.dubbo.base.domain.TStorage;
import com.example.dubbo.base.service.TOrderService;
import com.example.dubbo.base.service.TStorageService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TOrderServiceImplTest {

    @Resource
    private TOrderService tOrderService;
    @Resource
    private TStorageService tStorageService;


    @Before
    public void initStorage() {
        Integer count = tStorageService.lambdaQuery().count();
        if (count == 0) {
            TStorage tStorage = new TStorage();
            tStorage.setName("小米手机");
            tStorage.setCount(100);
            tStorage.setCommodityCode("123");
            tStorageService.save(tStorage);
        }
    }


    @Test
    public void createOrder() {
        tOrderService.createOrder(1, "123");

    }
}