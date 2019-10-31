package com.pcc.lessons.designPattern.abstractFactory;

public class XiaomiFactory implements IFactory {
    @Override
    public IComputer createComputer(String name) {
        return new XiaomiComputer(name);
    }

    @Override
    public IPhone createPhone(String name) {
        return new XiaomiPhone(name);
    }

    @Override
    public IWatch createWatch(String name) {
        return new XiaomiWatch(name);
    }
}
