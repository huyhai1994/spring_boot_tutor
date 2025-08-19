package org.example.learn_springboot;

import org.example.learn_springboot.config.ProjectConfig;
import org.example.learn_springboot.main.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class LearnSpringbootApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot x = new Parrot();
        x.setName("kiki");                         // (1) Creating the instance we want to add to the Spring context
        Supplier<Parrot> parrotSupplier = () -> x; //(2) define a Supplier to return this instance
        context.registerBean(
                "parrot1",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true)
        );                                       // (3) call the registerBean() method to add the instance to the Spring context;
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        // (4) verify the bean is now in the context, we refer to the parrot bean and print its name in the console
    }
}
