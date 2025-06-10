package com.example.naver_map_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {


    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}