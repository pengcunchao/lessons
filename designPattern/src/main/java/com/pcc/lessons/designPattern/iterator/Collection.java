package com.pcc.lessons.designPattern.iterator;

public interface Collection<E> {
    Iterator<E> iterator();
    void add(E e);
}
