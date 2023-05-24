package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class ControllerApp {
    @GetMapping
    public String getMessage(){
        return "yash had get your message";
    }
    @PutMapping
    public String putMessage(){
        return "yash had send message";
    }
    @DeleteMapping
    public String deleteMessage(){
        return "deleted items";
    }
    @PostMapping
    public String postMessage(){
        return "yash had send message";
    }
}
