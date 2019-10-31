package com.pcc.lessons.designPattern.abstractFactory;

public class AppleFactory implements IFactory {
    @Override
    public IComputer createComputer(String name) {
        return new Mac(name);
    }

    @Override
    public IPhone createPhone(String name) {
        return new ApplePhone(name);
    }

    @Override
    public IWatch createWatch(String name) {
        return new AppleWatch(name);
    }
}
