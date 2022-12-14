package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    public String hello () {
        return  "Hello world";
    }
}
