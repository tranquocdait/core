package com.example.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    
    @GetMapping("/helloWord")
    public String helloWord() {
        return "Hello word! This is the first code for the core project";
    }
}
