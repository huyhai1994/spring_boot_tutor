package org.example.main;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = c.getBean("commentService1", CommentService.class);
        var cs2 = c.getBean("commentService1", CommentService.class);
        System.out.println(cs1 == cs2);

    }
}
