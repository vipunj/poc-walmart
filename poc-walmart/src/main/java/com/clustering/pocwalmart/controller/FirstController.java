package com.clustering.pocwalmart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pingpong")
public class FirstController {
     @GetMapping
    public String pingPong(@RequestParam String message) {
        if ("ping".equals(message)) {
            return "pong";
        } else {
            return "Invalid message. Please send 'ping'.";
        }
    }
}
