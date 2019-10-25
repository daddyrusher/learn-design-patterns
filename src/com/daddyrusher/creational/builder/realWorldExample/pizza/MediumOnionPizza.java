package com.daddyrusher.creational.builder.realWorldExample.pizza;

public class MediumOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Onion pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
