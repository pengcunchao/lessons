package com.pcc.lessons.designPattern.abstractFactory;

public interface IFactory {
    IComputer createComputer(String name);
    IPhone createPhone(String name);
    IWatch createWatch(String name);
}
