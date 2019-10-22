package com.pcc.lessons.designPattern.factoryMethod;

public class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("peel up");
        System.out.println("bite flesh");
    }

    @Override
    public String toString() {
        return this.name + " apple";
    }
}
