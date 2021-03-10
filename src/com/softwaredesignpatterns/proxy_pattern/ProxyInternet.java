package com.softwaredesignpatterns.proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;


    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("sdf.com");
        bannedSites.add("gssf.com");
        bannedSites.add("rewrw.com");
        bannedSites.add("abgas.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())){
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverhost);
    }
}
