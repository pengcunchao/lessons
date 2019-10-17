package com.pcc.lessons.designPattern.state;

import com.pcc.lessons.designPattern.IllegalOperationException;
import com.pcc.lessons.designPattern.mediator.Mediator;

public class VisitorState implements State {
    private Mediator mediator;

    public VisitorState(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void invite(Chick host, Chick visitor) {
        throw new IllegalOperationException("can not invite visitor in visitor state");
    }


    @Override
    public void drift(Chick host) {
        host.setVisitor(null);
        mediator.stateChanged(this);
    }
}
