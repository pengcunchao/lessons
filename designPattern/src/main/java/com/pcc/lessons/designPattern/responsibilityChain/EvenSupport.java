package com.pcc.lessons.designPattern.responsibilityChain;

public class EvenSupport extends Support {
    public EvenSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 0;
    }
}
