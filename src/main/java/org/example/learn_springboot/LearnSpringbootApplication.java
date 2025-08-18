package org.example.learn_springboot;

import org.example.learn_springboot.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearnSpringbootApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot koko = context.getBean("Koko", Parrot.class);
        Parrot miki = context.getBean("Miki", Parrot.class);
        Parrot riki = context.getBean("Riki", Parrot.class);
        System.out.println(koko.getName());
        System.out.println(miki.getName());
        System.out.println(riki.getName());
    }

}
