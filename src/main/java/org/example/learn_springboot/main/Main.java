package org.example.learn_springboot.main;

import org.example.learn_springboot.model.Comment;
import org.example.learn_springboot.repositories.DBCommentRepository;
import org.example.learn_springboot.repositories.EmailCommentNotificationProxy;
import org.example.learn_springboot.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("Huy Hai");
        comment.setText("Demo comment");
        commentService.publishComment(comment);
    }
}
