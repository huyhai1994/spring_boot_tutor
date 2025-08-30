package org.example.service;

import org.example.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public int increaseCounter() {
        return commentRepository.addOne();

    }

    public int getCounter() {
        return commentRepository.getCounter();
    }
}
