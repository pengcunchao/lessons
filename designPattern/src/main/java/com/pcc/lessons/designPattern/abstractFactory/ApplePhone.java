package com.pcc.lessons.designPattern.abstractFactory;

public class ApplePhone implements IPhone {
    private String version;

    public ApplePhone(String version) {
        this.version = version;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("use iphone" + version + "call " + phoneNumber);
    }

    @Override
    public void sentMsg(String message) {
        System.out.println("use iphone" + version + "send " + message);
    }
}
