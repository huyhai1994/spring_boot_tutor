package org.example.config;

import org.example.learn_springboot.repositories.CommentNotificationProxy;
import org.example.learn_springboot.repositories.CommentRepository;
import org.example.learn_springboot.repositories.DBCommentRepository;
import org.example.learn_springboot.repositories.EmailCommentNotificationProxy;
import org.example.learn_springboot.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy){
        return new CommentService(commentRepository, commentNotificationProxy);

    }

}
