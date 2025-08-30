package org.example.main;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the CommentService!!!");
        var service1 = c.getBean(CommentService.class);
        var service2 = c.getBean(CommentService.class);
        System.out.println(service2 == service1);
        System.out.println("after retrieving the CommentService!!!");
    }
}

