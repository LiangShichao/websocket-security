package com.lsc.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "index", "index.*"})
    public String welcome(){
        return "index";
    }
}
