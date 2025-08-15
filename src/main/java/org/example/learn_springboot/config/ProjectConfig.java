package org.example.learn_springboot.config;

import org.example.learn_springboot.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("KoKo");
        return p;
    }
}
