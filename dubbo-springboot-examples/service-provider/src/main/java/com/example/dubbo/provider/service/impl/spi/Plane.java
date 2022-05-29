package com.example.dubbo.provider.service.impl.spi;

import com.example.dubbo.base.service.Fly;

public class Plane implements Fly {

    @Override
    public void fly() {
        System.out.println("Plane can Fly");
    }
}
