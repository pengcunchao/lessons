package com.pcc.lessons.designPattern.strategy;

public class SelectionSorter<E extends Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(E[] eles) {
        int min = 0;
        E temp = eles[0];
        for (int i = 0; i < eles.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < eles.length; j++) {
                if(eles[j].compareTo(eles[min])<0){
                    min = j;
                }
            }
            temp = eles[i];
            eles[i] = eles[min];
            eles[min] = temp;
        }
    }
}
