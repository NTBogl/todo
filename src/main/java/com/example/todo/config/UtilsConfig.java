package com.example.todo.config;

import com.example.utils.UtilsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilsConfig {

    @Bean
    public UtilsService utilsService() {
        return new UtilsService();
    }
}
