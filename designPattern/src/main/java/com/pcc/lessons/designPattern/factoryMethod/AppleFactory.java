package com.pcc.lessons.designPattern.factoryMethod;

public class AppleFactory extends FruitFactory {
    @Override
    public Fruit create(String name) {
        return new Apple(name);
    }
}
