package org.example.config;

import org.example.learn_springboot.repositories.*;
import org.example.learn_springboot.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.learn_springboot")
public class ProjectConfiguration {

}
