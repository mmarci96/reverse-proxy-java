package com.codecool.proxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticFilesController {

    @RequestMapping("/")
    public String serveHomePage() {
        return "forward:/index.html";
    }
}
