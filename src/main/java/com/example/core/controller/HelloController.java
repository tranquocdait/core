package com.example.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/helloWord", method = RequestMethod.GET)
    public String custom() {
        return "Hello word! This is the first code for the core project";
    }
}
