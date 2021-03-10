package com.softwaredesignpatterns.proxy_pattern;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("google.com");
            internet.connectTo("abc.com");
        }catch (Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
