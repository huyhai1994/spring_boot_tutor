package org.example.learn_springboot.entity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryDetailsPrinterTest {

    @Test
    void testPrint(){
        DeliveryDetailsPrinter ddp = new DeliveryDetailsPrinter(new SorterByAddress());
        ddp.printDetail();
    }
}