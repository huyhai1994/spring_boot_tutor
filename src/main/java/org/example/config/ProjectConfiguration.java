package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.learn_springboot.proxies", "org.example.learn_springboot.services", "org.example.learn_springboot.repositories"})
public class ProjectConfiguration {
}
