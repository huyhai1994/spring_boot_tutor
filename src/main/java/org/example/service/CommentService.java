package org.example.service;

import org.example.repository.CommentRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        System.out.println("CommentService instance created!" + Thread.currentThread().getName());
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
