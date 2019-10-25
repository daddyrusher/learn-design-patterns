package com.daddyrusher.behavioral.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionOfNames collection = new CollectionOfNames();

        for (Iterator iterator = collection.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
