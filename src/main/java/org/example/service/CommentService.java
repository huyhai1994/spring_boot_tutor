package org.example.service;

import org.example.repository.CommentRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        System.out.println("CommentService instance created in thread: " + Thread.currentThread().getName());
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public int increaseCounter() {
        System.out.println("Thread " + Thread.currentThread().getName());
        return commentRepository.addOne();

    }

    public int getCounter() {
        return commentRepository.getCounter();
    }
}
