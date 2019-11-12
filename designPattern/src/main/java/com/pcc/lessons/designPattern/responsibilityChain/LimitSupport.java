package com.pcc.lessons.designPattern.responsibilityChain;

public class LimitSupport extends  Support{
    private int min;
    private int max;

    public LimitSupport(String name, int min, int max) {
        super(name);
        this.min = min;
        this.max = max;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() >= min && trouble.getNumber() <= max;
    }

    @Override
    public String toString() {
        return "support [" + name + ',' + min + ',' + max + ']';
    }
}
