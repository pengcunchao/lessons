package com.pcc.lessons.designPattern.prototype;

public interface Product extends Cloneable {
    void use(String msg);
    Product createClone();
}
