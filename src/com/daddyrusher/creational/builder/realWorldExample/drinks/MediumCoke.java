package com.daddyrusher.creational.builder.realWorldExample.drinks;

public class MediumCoke extends Coke {
    @Override
    public String name() {
        return "500 ml coke";
    }

    @Override
    public String size() {
        return "Medium coke";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
