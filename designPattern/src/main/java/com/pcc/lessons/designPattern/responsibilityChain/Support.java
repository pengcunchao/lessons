package com.pcc.lessons.designPattern.responsibilityChain;

public abstract class Support {
    protected String name;
    protected Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNextAndReturn(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (this.next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by" + this);
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }

    @Override
    public String toString() {
        return "Support [" + name + ']';
    }

    protected abstract boolean resolve(Trouble trouble);
}
