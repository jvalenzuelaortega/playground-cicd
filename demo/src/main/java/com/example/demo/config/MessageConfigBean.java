package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfigBean {

    @Bean
    public String message() {
        return "Hello";
    }
}
