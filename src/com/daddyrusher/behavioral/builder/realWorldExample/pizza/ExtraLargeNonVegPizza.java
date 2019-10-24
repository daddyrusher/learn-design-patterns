package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class ExtraLargeNonVegPizza extends NonVegPizza{
    @Override
    public float price() {
        return 250.0f;
    }

    @Override
    public String name() {
        return "Masala pizza";
    }

    @Override
    public String size() {
        return "Extra large pizza";
    }
}
