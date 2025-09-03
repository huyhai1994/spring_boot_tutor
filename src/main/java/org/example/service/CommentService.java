package org.example.service;

import org.example.aspect.ToLog;
import org.example.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

    @ToLog
    public void editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
    }
}
