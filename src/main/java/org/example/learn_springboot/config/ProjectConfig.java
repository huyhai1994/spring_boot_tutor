package org.example.learn_springboot.config;

import org.example.learn_springboot.entity.Parrot;
import org.example.learn_springboot.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.learn_springboot.main")
//To tell Spring it needs to search for classes annotated with stereotype annotations.
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        return p;
    }

}
