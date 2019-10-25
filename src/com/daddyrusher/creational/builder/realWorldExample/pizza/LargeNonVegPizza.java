package com.daddyrusher.creational.builder.realWorldExample.pizza;

public class LargeNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 220.0f;
    }

    @Override
    public String name() {
        return "Masala pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
