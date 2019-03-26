package com.iot.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class LightController {
    @RequestMapping("/light")
    public String light(){
        return "这是光敏";
    }
}
