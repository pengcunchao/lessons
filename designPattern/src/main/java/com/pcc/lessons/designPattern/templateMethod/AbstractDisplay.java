package com.pcc.lessons.designPattern.templateMethod;

public abstract class AbstractDisplay {
    public void show(){
        open();
        print();
        close();
    }
    public abstract void open();
    public abstract void print();
    public abstract void close();
}
