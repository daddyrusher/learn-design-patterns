package com.daddyrusher.creational.builder.realWorldExample.drinks;

public class SmallPepsi extends Pepsi {
    @Override
    public String name() {
        return "300 ml Pepsi";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
