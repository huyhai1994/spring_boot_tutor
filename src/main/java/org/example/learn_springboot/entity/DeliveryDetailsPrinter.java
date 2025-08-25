package org.example.learn_springboot.entity;

public class DeliveryDetailsPrinter {

    private final Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void printDetails() {
        sorter.sortDetails();
        System.out.println("Print the delivery details");
    }


}
