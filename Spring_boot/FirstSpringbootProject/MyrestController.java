package com.example.FirstSpringProjectdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyrestController {
    @Value("${stud-name}")
    private String name;
    @Value("${stud-last}")
    private String lastname;

    @GetMapping ("/")
    public String display (){

        return "hello"+" "+name+""+lastname;
    }
}
