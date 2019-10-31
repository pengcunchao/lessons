package com.pcc.lessons.designPattern.abstractFactory;

import java.util.Date;

public class AppleWatch implements IWatch {
    private String version;

    public AppleWatch(String version) {
        this.version = version;
    }

    @Override
    public void getTime() {
        System.out.println("Iwatch " + version + " get time " + System.currentTimeMillis());
    }

    @Override
    public void record() {
        System.out.println("Iwatch " + version + " record " + System.currentTimeMillis());
    }
}
