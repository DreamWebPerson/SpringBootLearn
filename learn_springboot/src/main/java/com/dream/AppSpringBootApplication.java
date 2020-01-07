package com.dream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication = @Configuration+@EnableAutoConfiguration+@ComponentScan
//@Configuration:注入bean
//@EnableAutoConfiguration:加载第三方配置等 启动SpringMVC  扫包范围为本类
//@ComponentScan:扫包 默认扫描本类同级及子包
@SpringBootApplication
public class AppSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppSpringBootApplication.class, args);
    }
}
