package com.study.myTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardContoroller {

    @GetMapping("/list")
    public String list() {
        return "board/list";
    }

}
