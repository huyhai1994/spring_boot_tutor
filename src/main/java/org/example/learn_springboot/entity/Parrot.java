package org.example.learn_springboot.entity;


public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("bean Parrot created!!!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
