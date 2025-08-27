package org.example.learn_springboot.repositories;

import org.example.learn_springboot.model.Comment;

public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
