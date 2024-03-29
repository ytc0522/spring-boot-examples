package com.example.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProviderApp_B {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApp_B.class, args);
    }

}
