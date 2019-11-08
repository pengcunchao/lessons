package com.pcc.lessons.designPattern.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    @Override
    public void execute() {
        commands.forEach(command -> command.execute());
    }

    public void add(Command command){
        commands.add(command);
    }

    public void remove(Command command){
        commands.remove(command);
    }
}
