package com.example.springbootstarterpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class SpringBootStarterPackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterPackApplication.class, args);
    }

}
