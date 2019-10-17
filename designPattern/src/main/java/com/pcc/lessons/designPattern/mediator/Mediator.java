package com.pcc.lessons.designPattern.mediator;

import com.pcc.lessons.designPattern.state.State;

public interface Mediator {
    void stateChanged(State state);
}
