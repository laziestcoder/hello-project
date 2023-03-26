package com.example.mainapp;

import org.example.testservice.service.HelloService;
import org.example.testservice.service.HelloServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    //@Autowired
    private HelloService helloService;

    public CoreController() {
        helloService = new HelloServiceImpl();
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
//        Model model = new Model("aumit");
//        return model;
    }

    @GetMapping("")
    public String home() {
        return "home";
//        Model model = new Model("aumit");
//        return model;
    }
}
