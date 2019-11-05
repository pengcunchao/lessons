package com.pcc.lessons.designPattern.facade;

public class SecurityFacade {
    public static final SecurityFacade securityFacade = new SecurityFacade();
    private Light light1;
    private Light light2;
    private Light light3;
    private Alarm alarm1;
    private Alarm alarm2;

    public SecurityFacade() {
        light1 = new Light("1");
        light2 = new Light("2");
        light3 = new Light("3");
        alarm1 = new Alarm("1");
        alarm2 = new Alarm("2");
    }

    public static SecurityFacade getInstance(){
        return securityFacade;
    }

    public void alarm(){
        light1.flash();
        light2.flash();
        alarm1.alarm();
        alarm2.alarm();
        light3.flash();
    }

    public void monitor(){
        light1.turnOn();
        light2.turnOn();
        light3.turnOn();
        alarm1.stopAlarm();
        alarm2.stopAlarm();
    }
}
