package com.pcc.lessons.designPattern.observer;

public class FireMonitorObserver implements Observer<FireMonitor> {
    @Override
    public void update(FireMonitor observable) {
       String location =  observable.getLocation();
       System.out.println("call 119 to report fire disaster at " + location);
    }
}
