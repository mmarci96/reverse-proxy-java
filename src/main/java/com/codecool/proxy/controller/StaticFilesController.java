package com.codecool.proxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StaticFilesController {

    @RequestMapping("/")
    public RedirectView serveHomePage() {
        return new RedirectView("index.html");
    }
}
