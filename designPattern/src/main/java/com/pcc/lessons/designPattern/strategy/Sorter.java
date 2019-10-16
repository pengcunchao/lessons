package com.pcc.lessons.designPattern.strategy;

public interface Sorter<E extends Comparable<E>> {
    void sort(E[] eles);
}
