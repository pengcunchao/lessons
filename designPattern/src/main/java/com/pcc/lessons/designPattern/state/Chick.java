package com.pcc.lessons.designPattern.state;

public class Chick {
    private State state;
    private Chick visitor;

    public Chick(State state) {
        this.state = state;
    }

    public void setVisitor(Chick visitor) {
        this.visitor = visitor;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void invite(Chick visitor) {
        state.invite(this, visitor);
    }

    public void drift() {
        state.drift(this);
    }

}
