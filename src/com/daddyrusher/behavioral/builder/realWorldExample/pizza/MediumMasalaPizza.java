package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class MediumMasalaPizza extends VegPizza {
    @Override
    public float price() {
        return 120.0f;
    }

    @Override
    public String name() {
        return "Masala pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
