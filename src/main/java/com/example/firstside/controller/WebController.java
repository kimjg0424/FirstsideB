package com.example.firstside.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
@Controller
public class WebController {


    @GetMapping("/")
    public String index() {
        return "home.html";
    }

    @GetMapping("/singup")
    public String singup() {
        return "singup";
    }

}
