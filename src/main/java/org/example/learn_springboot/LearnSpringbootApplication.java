package org.example.learn_springboot;

import org.example.learn_springboot.config.ProjectConfig;
import org.example.learn_springboot.main.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class LearnSpringbootApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot x = new Parrot();
        x.setName("kiki");
        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot  p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
