package com.daddyrusher.structural.decorator;

public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " With Roasted Chicken and Chicken Carry";
    }

    public double foodPrice() { return super.foodPrice() + 150.0; }
}
