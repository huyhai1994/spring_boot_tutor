package org.example.main;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = c.getBean(CommentService.class);
        int threadNumbers = 5;
        var iteration = 10000;
        ExecutorService executorService = Executors.newFixedThreadPool(threadNumbers);

        long startTime = System.currentTimeMillis();

        for (int t = 0; t < threadNumbers; t++) {
            executorService.execute(() -> {
                for (int i = 0; i < iteration; i++) {
                    System.out.println(commentService.increaseCounter() + " " + Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("executed time: " + (endTime - startTime));
        System.out.println("Final counter value: " + commentService.getCounter());
        System.out.println("Expected value if no race condition: " + (iteration * threadNumbers));
    }


}

