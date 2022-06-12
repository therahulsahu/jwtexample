package com.example.jwtexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    String welcomeMessage() {
        return "Welcome to secured page";
    }

}
