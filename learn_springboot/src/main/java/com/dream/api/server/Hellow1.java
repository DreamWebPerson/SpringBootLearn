package com.dream.api.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellow1 {

    @RequestMapping("hellow1")
    public String hellow1() {
        return "Hellow1 , how to learn SpringBoot?";
    }
}
