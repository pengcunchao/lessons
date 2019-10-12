package com.pcc.lessons.designPattern.visitor;

import com.pcc.lessons.designPattern.composite.Directory;
import com.pcc.lessons.designPattern.composite.Entry;
import com.pcc.lessons.designPattern.composite.File;

import java.util.List;

public class Reader implements Visitor {
    @Override
    public void visit(File file) {
        System.out.println("read file " + file.getName() + ", size is " + file.getSize());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("read from directory " + directory.getName() + ",total size is " + directory.getSize());
        List<Entry> entries = directory.getEntries();
        entries.forEach(entry -> entry.accept(this));
    }
}
