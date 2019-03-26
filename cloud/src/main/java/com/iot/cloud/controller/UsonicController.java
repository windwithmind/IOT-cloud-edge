package com.iot.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsonicController {
    @RequestMapping("/usonic")
    public String usonic(){
        return "这是声纳";
    }
}
