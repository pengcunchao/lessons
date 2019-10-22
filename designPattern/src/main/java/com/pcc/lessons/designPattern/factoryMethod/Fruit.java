package com.pcc.lessons.designPattern.factoryMethod;

public abstract class Fruit {
    protected String name;

    public Fruit(String name) {
        this.name = name;
    }

    public abstract void eat();
}
