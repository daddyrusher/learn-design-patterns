package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class SmallNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return "Non-veg pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
