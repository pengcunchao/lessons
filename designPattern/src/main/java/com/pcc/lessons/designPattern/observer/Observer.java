package com.pcc.lessons.designPattern.observer;

public interface Observer<T extends Observable> {
    void update(T observable);
}
