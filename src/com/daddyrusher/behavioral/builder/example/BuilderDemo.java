package com.daddyrusher.behavioral.builder.example;

public class BuilderDemo {
    public static void main(String[] args) {
        CDBuilder builder = new CDBuilder();
        CDType cdType1 = builder.buildSonyCD();
        CDType cdType2 = builder.buildSamsungCD();
        cdType1.showItems();
        cdType2.showItems();
    }
}
