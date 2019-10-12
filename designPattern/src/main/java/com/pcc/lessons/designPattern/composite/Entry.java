package com.pcc.lessons.designPattern.composite;

import com.pcc.lessons.designPattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Entry {
    protected int size;
    protected String name;
    protected List<Entry> entries = new ArrayList<>();

    public abstract void accept(Visitor visitor);

    public abstract void add(Entry entry);

    public abstract void remove(Entry entry);

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setSize(int size){
        this.size = size;
    }
}