package com.pcc.lessons.designPattern.abstractFactory;

public class XiaomiPhone implements IPhone {
    private String name;

    public XiaomiPhone(String name) {
        this.name = name;
    }


    @Override
    public void call(String phoneNumber) {
        System.out.println("call " + phoneNumber + " using mi" + name);
    }

    @Override
    public void sentMsg(String message) {
        System.out.println("Send message " + message + " using mi" + name);
    }
}
