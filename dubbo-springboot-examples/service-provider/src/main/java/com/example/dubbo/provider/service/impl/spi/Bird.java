package com.example.dubbo.provider.service.impl.spi;

import com.example.dubbo.base.service.Fly;

public class Bird implements Fly {

    @Override
    public void fly() {
        System.out.println(" Bird can fly");
    }
}
