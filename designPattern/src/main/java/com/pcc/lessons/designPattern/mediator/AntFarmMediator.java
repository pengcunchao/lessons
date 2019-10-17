package com.pcc.lessons.designPattern.mediator;

import com.pcc.lessons.designPattern.state.AloneState;
import com.pcc.lessons.designPattern.state.Chick;
import com.pcc.lessons.designPattern.state.State;
import com.pcc.lessons.designPattern.state.VisitorState;

public class AntFarmMediator implements Mediator {
    private Chick chick;
    private VisitorState visitorState;
    private AloneState aloneState;

    public void setChick(Chick chick) {
        this.chick = chick;
    }

    public void setVisitorState(VisitorState visitorState) {
        this.visitorState = visitorState;
    }

    public void setAloneState(AloneState aloneState) {
        this.aloneState = aloneState;
    }

    @Override
    public void stateChanged(State state) {
        if (state == visitorState) {
            chick.setState(aloneState);
        } else {
            chick.setState(visitorState);
        }
    }
}
