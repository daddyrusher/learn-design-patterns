package com.daddyrusher.structural.facade;

public class Iphone implements MobileShop {
    @Override
    public void modelNumber() {
        System.out.println("Iphone 11 Pro Max");
    }

    @Override
    public void price() {
        System.out.println("110000 RUB");
    }
}
