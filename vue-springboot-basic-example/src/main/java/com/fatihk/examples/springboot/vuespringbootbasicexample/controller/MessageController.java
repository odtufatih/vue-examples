package com.fatihk.examples.springboot.vuespringbootbasicexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to example Spring Boot & VueJS application!";
    }

}