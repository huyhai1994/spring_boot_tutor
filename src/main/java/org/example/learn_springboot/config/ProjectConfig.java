package org.example.learn_springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.learn_springboot.main")
//To tell Spring it needs to search for classes annotated with stereotype annotations.
public class ProjectConfig {


}
