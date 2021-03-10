package com.softwaredesignpatterns.Iterator_pattern;

public class NotificationBar {
    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications(){
        Iterator iterator = notificationCollection.createIterator();
        System.out.println("========= Notification BAR ===========");
        while (iterator.hasNext()){
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
