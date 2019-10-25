package com.daddyrusher.structural.facade;

public class Blackberry implements MobileShop {
    @Override
    public void modelNumber() {
        System.out.println("Blackberry Z10");
    }

    @Override
    public void price() {
        System.out.println("60000 RUB");
    }
}
