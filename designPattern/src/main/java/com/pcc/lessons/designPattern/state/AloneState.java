package com.pcc.lessons.designPattern.state;

import com.pcc.lessons.designPattern.IllegalOperationException;
import com.pcc.lessons.designPattern.mediator.Mediator;

public class AloneState implements State {
    private Mediator mediator;

    public AloneState(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void invite(Chick host, Chick visitor) {
        host.setVisitor(visitor);
        mediator.stateChanged(this);
    }

    @Override
    public void drift(Chick host) {
        throw new IllegalOperationException("no visitor to drift when alone");
    }
}
