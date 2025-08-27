package org.example.learn_springboot.repositories;

import org.example.learn_springboot.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
