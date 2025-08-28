package org.example.config;

import org.example.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentService commentService1() {
        return new CommentService();
    }

    @Bean
    public CommentService commentService2() {
        return new CommentService();
    }

}
