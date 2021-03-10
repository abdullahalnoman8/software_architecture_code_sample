package com.softwaredesignpatterns.composite_pattern.example_2;

public class CompositeClient {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Apple","Iphone 12 Pro",1300.00);
        Mobile mobile1 = new Mobile("Samsung","S20 Altra",1400.00);

        System.out.println("Mobile phone as an individual Object.");

        GadgetDirectory phoneDirectory = new GadgetDirectory();
        phoneDirectory.addGadget(mobile);
        phoneDirectory.addGadget(mobile1);
        phoneDirectory.showGadgetDetails();

        Tablet tablet = new Tablet("Samsung","Model S5",700.00);
        Tablet tablet1 = new Tablet("Samsung","Model 30",790.00);
        System.out.println();
        System.out.println("Tablet as an individual Object.");

        GadgetDirectory tabletDirectory = new GadgetDirectory();
        tabletDirectory.addGadget(tablet);
        tabletDirectory.addGadget(tablet1);
        tabletDirectory.showGadgetDetails();

        System.out.println();
        System.out.println("All the objects together.");

        GadgetDirectory gadgetDirectory = new GadgetDirectory();
        gadgetDirectory.addGadget(phoneDirectory);
        gadgetDirectory.addGadget(tabletDirectory);
        gadgetDirectory.showGadgetDetails();



    }
}
