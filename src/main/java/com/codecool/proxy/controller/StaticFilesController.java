package com.codecool.proxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/", "/{path:[^\\.]*}", "/**/{path:[^\\.]*}"})
public class StaticFilesController {

    public String serveHomePage() {
        return "forward:/index.html";
    }
}
