package com.example.springbasicrestfulApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greetMessage(){
        return "Hello how are you?";
    }
}
