package com.pcc.lessons.designPattern.visitor;

import com.pcc.lessons.designPattern.composite.Directory;
import com.pcc.lessons.designPattern.composite.File;

public interface Visitor {
    void visit(File file);
    void visit(Directory directory);

}
