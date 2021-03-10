package com.softwaredesignpatterns.proxy_pattern;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
    }
}
