package org.example.learn_springboot.entity;

public class Person {
    private String name;
    private Parrot parrot;

    public Person() {
        System.out.println("bean Person created with Hashcode: "+ this.hashCode());
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

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
