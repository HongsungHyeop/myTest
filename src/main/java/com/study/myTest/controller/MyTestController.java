package com.study.myTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTestController {

    @GetMapping
    public String index() {
        return "index";
    }
}
