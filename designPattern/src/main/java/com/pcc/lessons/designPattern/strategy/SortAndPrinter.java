package com.pcc.lessons.designPattern.strategy;

public class SortAndPrinter<E extends Comparable<E>> {
    private Sorter<E> sorter;
    private E[] data;

    public SortAndPrinter(Sorter<E> sorter, E[] data) {
        this.sorter = sorter;
        this.data = data;
    }

    public void sortAndPrint() {
        print();
        sorter.sort(data);
        print();
    }

    private void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if(i != data.length - 1){
                System.out.print(',');
            }
        }
        System.out.println();
    }
}
