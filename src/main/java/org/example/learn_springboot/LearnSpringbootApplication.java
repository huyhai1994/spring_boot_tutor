package org.example.learn_springboot;

import org.example.learn_springboot.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearnSpringbootApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
