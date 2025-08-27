package org.example.learn_springboot.services;

import org.example.learn_springboot.model.Comment;
import org.example.learn_springboot.repositories.CommentNotificationProxy;
import org.example.learn_springboot.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
