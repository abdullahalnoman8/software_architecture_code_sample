package com.softwaredesignpatterns.Iterator_pattern;

public class IteratorClientDemo {
    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar nb = new NotificationBar(notificationCollection);
        nb.printNotifications();
    }
}
