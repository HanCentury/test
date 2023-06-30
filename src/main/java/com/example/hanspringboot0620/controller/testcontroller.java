package com.example.hanspringboot0620.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class testcontroller {
    @GetMapping("/hello")
    public  String hello(){
        return  "hello world  您好";
    }
}
