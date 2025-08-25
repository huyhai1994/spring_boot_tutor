package org.example.learn_springboot.entity;

public class DeliveryDetailsPrinter {
    public void printDetails(String type) {
        if ("Address".equals(type)) {
            SorterByAddress sorterByAddress = new SorterByAddress();
            sorterByAddress.sortDetails();
        } else if ("Name".equals(type)) {
            SorterByName sorterByName = new SorterByName();
            sorterByName.sortDetails();
        } else {
            throw new RuntimeException("sorting type not supported");
        }
        System.out.println("Print the delivery details");
    }

    public static void main(String[] args) {
        DeliveryDetailsPrinter deliveryDetailsPrinter = new DeliveryDetailsPrinter();
        deliveryDetailsPrinter.printDetails("Address");
        deliveryDetailsPrinter.printDetails("Name");
    }
}
