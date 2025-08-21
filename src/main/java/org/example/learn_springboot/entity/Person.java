package org.example.learn_springboot.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

}
