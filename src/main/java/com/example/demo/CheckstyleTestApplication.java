package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication 
@EnableWebMvc
public class CheckstyleTestApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CheckstyleTestApplication.class, args);
        String b = "teste";
        String a = "teste";
        String c = "Teste";
    }
}
