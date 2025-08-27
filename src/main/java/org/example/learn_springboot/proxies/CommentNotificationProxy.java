package org.example.learn_springboot.proxies;

import org.example.learn_springboot.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
