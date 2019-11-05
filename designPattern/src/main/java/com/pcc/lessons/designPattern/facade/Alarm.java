package com.pcc.lessons.designPattern.facade;

public class Alarm {
    private String order;

    public Alarm(String order) {
        this.order = order;
    }

    public void alarm(){
        System.out.println("Alarm " + order + " is shouting out");
    }

    public void stopAlarm(){
        System.out.println("Alarm " + order + " is quiet");
    }

}
