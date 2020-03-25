package com.jingtoo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloIn {

    @GetMapping("/info")
    public String info() {
        int a = 100/0;
        return "123";
    }

}
