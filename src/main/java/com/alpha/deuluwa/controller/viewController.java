package com.alpha.deuluwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {

    @GetMapping("/")
    public String index() {
        return "forward:/index.html";  // static 폴더 안의 index.html을 보여줘!
    }
}
