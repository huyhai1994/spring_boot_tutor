package org.example.main;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = c.getBean(CommentService.class);
        var cs2 = c.getBean(UserService.class);
        System.out.println(cs1.getCommentRepository() == cs2.getCommentRepository());

    }
}
