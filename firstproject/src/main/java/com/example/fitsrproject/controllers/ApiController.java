package com.example.fitsrproject.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public  String mainRequest(){
        return  "Main request";
    }

    @GetMapping("/hello")
    public String hello(){
        return  "Hello Tharindu";
    }
}
