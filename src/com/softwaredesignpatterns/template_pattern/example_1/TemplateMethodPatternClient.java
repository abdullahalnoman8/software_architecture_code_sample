package com.softwaredesignpatterns.template_pattern.example_1;

public class TemplateMethodPatternClient {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrderProcessTemplate = new StoreOrder();
        storeOrderProcessTemplate.processOrder(true);
    }
}
