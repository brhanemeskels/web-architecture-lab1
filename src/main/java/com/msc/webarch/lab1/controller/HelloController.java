package com.msc.webarch.lab1.controller;

import com.msc.webarch.lab1.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World - Web Architecture Lab";
    }
    @GetMapping("/greeting")
    public String gettingName(@RequestParam String name){
        return "Hello " + name +", welcome to web Architecture";
    }

    @GetMapping("/hello2")
    public HelloResponse hello2(){
        return new HelloResponse("Hello World", "Web Architecture Lab");
    }



}
