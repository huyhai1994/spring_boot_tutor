package org.example.learn_springboot.config;

import org.example.learn_springboot.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "Koko")
    // same as @Bean(value = "Koko")
    //         @Bean ("Koko")
    Parrot parrot() {
        var p = new Parrot();
        p.setName("KoKo");
        return p;
    }

    @Bean(name = "Miki")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean(name = "Riki")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

}
