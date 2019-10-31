package com.pcc.lessons.designPattern.abstractFactory;

public class Mac implements IComputer {
    private String version;

    public Mac(String version) {
        this.version = version;
    }

    @Override
    public void surf(String ip) {
        System.out.println("Mac " + version + "view " + ip);
    }

    @Override
    public void playGame(String name) {
        System.out.println("Mac " + version + "play game " + name);
    }
}
