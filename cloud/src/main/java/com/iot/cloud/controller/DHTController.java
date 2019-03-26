package com.iot.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DHTController {
    @RequestMapping("/dht")
    public String dht(){
        return "这是温湿度监控界面";
    }
}
