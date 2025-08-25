package org.example.learn_springboot.entity;

public class DeliveryDetailsPrinter {

    private SorterByAddress sorterByAddress;
    private SorterByName sorterByName;

    public DeliveryDetailsPrinter(SorterByAddress sorterByAddress, SorterByName sorterByName) {
        this.sorterByAddress = sorterByAddress;
        this.sorterByName = sorterByName;
    }

    public void printDetails(String type) {
        if ("Address".equals(type)) {
            sorterByAddress = new SorterByAddress();
            sorterByAddress.sortDetails();
        } else if ("Name".equals(type)) {
            sorterByName = new SorterByName();
            sorterByName.sortDetails();
        } else {
            throw new RuntimeException("sorting type not supported");
        }
        System.out.println("Print the delivery details");
    }

    public static void main(String[] args) {
        DeliveryDetailsPrinter deliveryDetailsPrinter = new DeliveryDetailsPrinter(
                new SorterByAddress(),
                new SorterByName()
        );
        deliveryDetailsPrinter.printDetails("Address");
        deliveryDetailsPrinter.printDetails("Name");
    }
}
