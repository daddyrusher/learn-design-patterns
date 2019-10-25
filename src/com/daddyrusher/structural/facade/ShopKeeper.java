package com.daddyrusher.structural.facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
        this.blackberry = new Blackberry();
    }
    public void iphoneSale() {
        iphone.modelNumber();
        iphone.price();
    }
    public void samsungSale() {
        samsung.modelNumber();
        samsung.price();
    }
    public void blackberrySale() {
        blackberry.modelNumber();
        blackberry.price();
    }
}
