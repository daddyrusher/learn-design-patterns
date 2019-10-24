package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class SmallMasalaPizza extends VegPizza {
    @Override
    public float price() {
        return 100.0f;
    }

    @Override
    public String name() {
        return "Masala pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
