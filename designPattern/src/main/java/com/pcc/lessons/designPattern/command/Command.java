package com.pcc.lessons.designPattern.command;

public interface Command {
    void execute();
    void add(Command command);
    void remove(Command command);
}
