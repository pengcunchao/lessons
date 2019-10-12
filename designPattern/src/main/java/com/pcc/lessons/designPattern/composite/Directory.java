package com.pcc.lessons.designPattern.composite;

import com.pcc.lessons.designPattern.visitor.Visitor;

public class Directory extends Entry {

    public Directory() {
    }

    public Directory(String name, int size) {
        this.name = name;
        this.size  = size;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Entry entry) {
        entries.add(entry);
        size += entry.getSize();
    }

    @Override
    public void remove(Entry entry) {
        entries.remove(entry);
        size -= entry.getSize();
    }
}
