package com.daddyrusher.structural.proxy;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Maksim Zanin");
        officeInternetAccess.grantInternetAccess();
    }
}
