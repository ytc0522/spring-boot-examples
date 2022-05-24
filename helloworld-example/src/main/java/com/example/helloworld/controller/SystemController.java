package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system")
public class SystemController {

    @GetMapping("/getUserDir")
    public String getUserDir(){
        String property = System.getProperty("user.dir");
        return property;
    }


}
