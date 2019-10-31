package com.pcc.lessons.designPattern.abstractFactory;

public class XiaomiComputer implements IComputer {
    private String name;

    public XiaomiComputer(String name) {
        this.name = name;
    }


    @Override
    public void surf(String ip) {
        System.out.println("View content in " + ip + " using mi " + name);
    }

    @Override
    public void playGame(String name) {
        System.out.println("Play game " + name + " using mi " + this.name);
    }
}
