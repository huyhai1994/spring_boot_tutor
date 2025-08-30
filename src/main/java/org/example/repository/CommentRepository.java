package org.example.repository;

import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class CommentRepository {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public int addOne() {
        return counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
