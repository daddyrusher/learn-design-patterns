package com.daddyrusher.structural.facade;

public class Samsung implements MobileShop {
    @Override
    public void modelNumber() {
        System.out.println("Samsung Galaxy S10");
    }

    @Override
    public void price() {
        System.out.println("95000 RUB");
    }
}
