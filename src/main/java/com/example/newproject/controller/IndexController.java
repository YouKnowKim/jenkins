package com.example.newproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/hellos")
    public String hell() {
        return "Hell";
    }
}
