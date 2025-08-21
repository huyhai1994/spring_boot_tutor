package org.example.learn_springboot.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
        System.out.println("bean Parrot created with Hashcode: " + this.hashCode());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
