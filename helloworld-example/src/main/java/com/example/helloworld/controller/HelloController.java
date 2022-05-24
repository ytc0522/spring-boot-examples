package com.example.helloworld.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Swagger演示接口")
@RequestMapping("hello")
@RestController
public class HelloController {

    @ApiOperation(value = "world")
    @GetMapping("world")
    public String world(String name) {
        return "helllo world " + name;
    }


}
