package com.pcc.lessons.designPattern.facade;

public class Light {
    private String order;

    public Light(String order) {
        this.order = order;
    }

    public void turnOn(){
        System.out.println("open the light " + order);
    }

    public void turnOff(){
        System.out.println("close the light " + order);
    }

    public void flash(){
        System.out.println("flash the light " + order);
    }
}
