package com.softwaredesignpatterns.composite_pattern.example_2;

import java.util.ArrayList;
import java.util.List;

public class GadgetDirectory implements Gadget{
    private List<Gadget> gadgetList;

    public GadgetDirectory() {
        gadgetList = new ArrayList<>();

    }


    @Override
    public void showGadgetDetails() {
        for (Gadget gadget: gadgetList) {
            gadget.showGadgetDetails();
        }
    }

    public void addGadget(Gadget gadget){
        gadgetList.add(gadget);
    }

}
