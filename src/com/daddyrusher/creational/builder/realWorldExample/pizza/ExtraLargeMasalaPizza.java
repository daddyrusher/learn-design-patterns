package com.daddyrusher.creational.builder.realWorldExample.pizza;

public class ExtraLargeMasalaPizza extends VegPizza {
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return "Masala pizza";
    }

    @Override
    public String size() {
        return "Extra large size";
    }
}
