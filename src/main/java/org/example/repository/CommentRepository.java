package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    public static int counter = 0;

    public int addOne() {
        counter++;
        return counter;
    }

    public int getCounter() {
        return counter;
    }
}
