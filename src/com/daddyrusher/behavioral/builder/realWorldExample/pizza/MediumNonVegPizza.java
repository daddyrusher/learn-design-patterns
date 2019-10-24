package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class MediumNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 200.0f;
    }

    @Override
    public String name() {
        return "Non-veg pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
