package com.iot.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomepageController {
    @RequestMapping("/home")
    public String home(){
        return "这是主页";
    }
}
