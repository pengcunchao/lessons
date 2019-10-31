package com.pcc.lessons.designPattern.abstractFactory;

public class XiaomiWatch implements IWatch {
    private String name;

    public XiaomiWatch(String name) {
        this.name = name;
    }

    @Override
    public void getTime() {
        System.out.println(System.currentTimeMillis() + " by mi " + name);
    }

    @Override
    public void record() {
        System.out.println("Record time by mi " + name);
    }
}
