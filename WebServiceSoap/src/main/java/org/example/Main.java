package org.example;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String url="http://localhost:8085/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web Services publie sur :"+url);
    }
}
