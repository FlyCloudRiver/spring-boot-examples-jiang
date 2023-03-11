package com.neo.controller;

import com.neo.aop.CalcService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {

    @Resource
    CalcService calcService;
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}