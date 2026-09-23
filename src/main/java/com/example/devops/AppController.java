package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Hello from Java DevOps Application!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
