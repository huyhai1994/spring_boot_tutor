package org.example.learn_springboot;

import org.example.learn_springboot.config.ProjectConfig;
import org.example.learn_springboot.entity.Parrot;
import org.example.learn_springboot.entity.Person;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearnSpringbootApplication {

    public static void main(String[] args) {
        try {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            Person person = context.getBean(Person.class);
            Parrot parrot = context.getBean("parrot2", Parrot.class);
            System.out.println("Parrot' name: " + parrot.getName());
            System.out.println("Person's parrot: " + person.getParrot());
        } catch (NoUniqueBeanDefinitionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finish Demo");
        }
    }
}
