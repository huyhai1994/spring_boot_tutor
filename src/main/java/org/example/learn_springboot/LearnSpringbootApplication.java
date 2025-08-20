package org.example.learn_springboot;

import org.example.learn_springboot.config.ProjectConfig;
import org.example.learn_springboot.entity.Parrot;
import org.example.learn_springboot.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearnSpringbootApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // (1) Creates an instance of the Spring context based on the configuration class
        Person person = context.getBean(Person.class);
        // (2)  Gets a reference to the Person bean from the Spring context
        Parrot parrot = context.getBean(Parrot.class);
        // (3) Gets a reference to the Parrot bean from the Spring context
        System.out.println("Person's name: " + person.getName());
        // (4) Prints the person’s name to prove that the Person bean is in the context
        System.out.println("Parrot's name: " + parrot.getName());
        // (5) Prints the parrot’s name to prove that the Parrot bean is in the context
        System.out.println("Person's parrot: " + person.getParrot());
        // (6) Prints the person’s parrot to prove that there’s not yet a relationship between the instances
    }
}
