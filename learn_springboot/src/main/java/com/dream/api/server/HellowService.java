package com.dream.api.server;


import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

//所有方法的返回值都已JSON返回
//@RestController = @Controller+@ResponseBody
//@RestController
//加载第三方配置等 启动SpringMVC  扫包范围为本类
//@EnableAutoConfiguration
//扫描
//@ComponentScan("com.dream.api.server")
public class HellowService {

    @RequestMapping("Hellow")
    public String hellow() {
        return "Hellow , how to learn SpringBoot?";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellowService.class, args);
    }
}
