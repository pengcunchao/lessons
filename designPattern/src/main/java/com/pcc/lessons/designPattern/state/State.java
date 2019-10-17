package com.pcc.lessons.designPattern.state;

public interface State {
    void invite(Chick host, Chick visitor);
    void drift(Chick host);
}
