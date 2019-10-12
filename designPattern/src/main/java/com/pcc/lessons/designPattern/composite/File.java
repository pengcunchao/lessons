package com.pcc.lessons.designPattern.composite;

import com.pcc.lessons.designPattern.visitor.Visitor;

public class File extends Entry {

    public File(String name, int size) {
        this.name = name;
        this.size  = size;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Entry entry) {
        throw new FileTreatmentException("cannot add entry into file");
    }

    @Override
    public void remove(Entry entry) {
        throw new FileTreatmentException("cannot remove entry from file");
    }
    @Override
    protected void setName(String name){
        this.name = name + '/' + this.name;
    }
}
