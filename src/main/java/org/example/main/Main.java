package org.example.main;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = c.getBean(CommentService.class);
        Runnable myNewThread = () -> {
            for (int i = 0; i < 100000000; i++) {
                System.out.println(commentService.increaseCounter() + " " + Thread.currentThread().getName());
            }
            Thread.dumpStack();
        };
        Thread newThread1 = new Thread(myNewThread);
        Thread newThread2 = new Thread(myNewThread);
        Thread newThread3 = new Thread(myNewThread);
        newThread1.start();
        newThread2.start();
        newThread3.start();
        try {
            newThread1.join();
            newThread2.join();
            newThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final counter value: " + commentService.getCounter());
        System.out.println("Expected value if no race condition: " + (1000 * 3));


    }
}
