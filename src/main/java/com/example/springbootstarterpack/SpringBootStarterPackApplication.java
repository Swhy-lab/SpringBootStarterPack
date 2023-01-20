package com.example.springbootstarterpack;

import com.example.springbootstarterpack.mapper.TestServiceMapper;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootStarterPackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterPackApplication.class, args);

    }

}
