package org.example.main;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service1 = c.getBean(CommentService.class);
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(() -> {
            for (int i = 0; i < 100000; i++) {
                service1.increaseCounter();
            }
        });
        var service2 = c.getBean(CommentService.class);
        threadPool.execute(() -> {
            for (int i = 0; i < 100000; i++) {
                service2.increaseCounter();
            }
        });
        threadPool.shutdown();

        System.out.println("Before retrieving the CommentService!!!");
        System.out.println(service2 == service1);
        System.out.println("after retrieving the CommentService!!!");
    }

}

