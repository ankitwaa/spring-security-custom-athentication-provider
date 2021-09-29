package com.example.springsecuritycustomathenticationprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/secure/hello")
    public String secureHello(){
        return "Secure Hello";
    }

    @GetMapping("/public/hello")
    public String publicHello(){
        return "Public Hello";
    }
}
