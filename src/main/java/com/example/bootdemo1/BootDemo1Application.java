package com.example.bootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootDemo1Application {

    @RequestMapping("/")
    String home() {
        return "home";
    }


    public static void main(String[] args) {
        SpringApplication.run(BootDemo1Application.class, args);
    }

}
