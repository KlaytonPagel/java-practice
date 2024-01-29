package com.practice.springbootpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// REST stands for representational State Transfer
@RestController
public class TestController {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/not")
    public String helloNotWorld(){
        return "Hello Not World";
    }
}
