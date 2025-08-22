package org.example.learn_springboot.entity;

public class DeliveryDetailsPrinter {
    private SorterByAddress sorter;

    public DeliveryDetailsPrinter(SorterByAddress sorter) {
        this.sorter = sorter;
    }

    public void printDetail() {
        sorter.sortDetails();
        System.out.println("print something!");
    }

}
