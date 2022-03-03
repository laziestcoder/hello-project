package com.example.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example", "com.example"})
public class MainAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainAppApplication.class, args);
    }

//    @Bean
//    HelloService helloService() {
//        return  helloService();
//    }
}
