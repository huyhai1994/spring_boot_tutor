package org.example.learn_springboot.main;

import org.example.config.ProjectConfiguration;
import org.example.learn_springboot.model.Comment;
import org.example.learn_springboot.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Huy Hai");
        comment.setText("Demo comment");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
