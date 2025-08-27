package org.example.learn_springboot.repositories;

import org.example.learn_springboot.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
