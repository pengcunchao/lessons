package com.pcc.lessons.designPattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FireMonitor implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private Random random= new Random();
    private String location;

    public FireMonitor(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void execute(){
        double temperature = random.nextDouble();
        if(Double.compare(temperature, 0.0d) > 0){
            notifyObservers();
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }
}
