package com.example.service.provider.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-provider-A")
public interface HelloApiService {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);

}
