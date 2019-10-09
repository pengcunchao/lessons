package com.pcc.lessons.designPattern.iterator;

public class ArrayList<E> implements Collection<E> {
    private E[] elements;
    private int size;

    public ArrayList(int capacity) {
        this.elements = (E[])new Object[capacity];
        this.size = 0;
    }

    public void add(E e){
        if(size >= elements.length){
            return;
        }
        elements[size] = e;
        size ++;
    }

    public Iterator<E> iterator() {
        return new ArrayListIterator<E>(this);
    }

    private static class ArrayListIterator<E> implements Iterator<E>{
        private ArrayList<E> arrayList;
        private int index;

        public ArrayListIterator(ArrayList<E> arrayList) {
            this.arrayList = arrayList;
            this.index = 0;
        }

        public boolean hasNext() {
            return index < arrayList.size;
        }

        public E next() {
            E cur = arrayList.elements[index];
            index ++;
            return cur;
        }
    }
}
