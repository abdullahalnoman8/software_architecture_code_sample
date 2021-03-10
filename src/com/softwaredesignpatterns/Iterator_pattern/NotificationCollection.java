package com.softwaredesignpatterns.Iterator_pattern;

import java.util.Collections;

public class NotificationCollection implements Collection {

    Notification[] notificationList;
    int numberOfItems =0;
    static  final int MAX_ITEMS = 6;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String s) {
        Notification notification = new Notification(s);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Full");
        }else{
            notificationList[numberOfItems] = notification;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
