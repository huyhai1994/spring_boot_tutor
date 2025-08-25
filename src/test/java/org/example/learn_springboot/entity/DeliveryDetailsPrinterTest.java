package org.example.learn_springboot.entity;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryDetailsPrinterTest {
    public static void main(String[] args) {
        DeliveryDetailsPrinter deliveryAddressDetailsPrinter = new DeliveryDetailsPrinter(
                new SorterByAddress());
        deliveryAddressDetailsPrinter.printDetails();
        DeliveryDetailsPrinter deliveryNameDetailsPrinter = new DeliveryDetailsPrinter(
                new SorterByName());
        deliveryNameDetailsPrinter.printDetails();
    }

}