package com.weather.spring.cloud.initializrstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: initializr-start
 * @description: This is test  gradle demo
 * @author: W.HL
 * @create: 2019-01-03 14:44
 **/
@RequestMapping("/test")
@RestController
public class HelloWorld
{

    @GetMapping("/hello")
    public String hello(){
        return "Hello World !";
    }
}
