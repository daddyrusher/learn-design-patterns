package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class SmallOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 120.0f;
    }

    @Override
    public String name() {
        return "Onion pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
