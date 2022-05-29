package com.example.dubbo.provider.service.impl.spi;

import com.example.dubbo.base.service.Fly;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class SPITest {


    public static void main(String[] args) {
        ExtensionLoader<Fly> extensionLoader = ExtensionLoader.getExtensionLoader(Fly.class);


        Fly bird = extensionLoader.getExtension("bird");
        bird.fly();

        Fly plane = extensionLoader.getExtension("plane");
        plane.fly();


    }

}
