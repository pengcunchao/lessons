package com.pcc.lessons.designPattern.observer;


public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void execute();
}
