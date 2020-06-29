package com.jenkins.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/Hello")
    public String hello() {
        return "Hello, Good morning! Final Test for demo";
    }
}
