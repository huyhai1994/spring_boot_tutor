package org.example.config;

import org.example.learn_springboot.repositories.*;
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
    public CommentNotificationProxy commentEmailNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentNotificationProxy commentPushNotificationProxy() {
        return new CommentPushNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentPushNotificationProxy) {
        return new CommentService(commentRepository, commentPushNotificationProxy);
    }

}
