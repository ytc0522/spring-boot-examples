package com.example.dubbo.provider.components;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShardReentrantLockComponent {

    @Resource
    private CuratorFramework curatorFramework;

    public <T> T acquireLock() {
        return null;
    }


}
