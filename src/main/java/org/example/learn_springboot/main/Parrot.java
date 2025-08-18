package org.example.learn_springboot.main;

import org.springframework.stereotype.Component;

@Component // Tells Spring to add an instance of this class in its context
public class Parrot {
    private String name = "koko";

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
