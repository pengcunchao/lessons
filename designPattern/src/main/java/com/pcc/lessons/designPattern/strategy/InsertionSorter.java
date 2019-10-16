package com.pcc.lessons.designPattern.strategy;

public class InsertionSorter<E extends Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(E[] eles) {

        for (int i = 1; i < eles.length; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (eles[j].compareTo(eles[i]) < 0) {
                    break;
                }
                j--;
            }

            E temp = eles[i];
            if (j < i - 1) {
                for (int k = i - 1; k > j; k--) {
                    eles[k + 1] = eles[k];
                }
            }

            eles[j + 1] = temp;

        }
    }
}
