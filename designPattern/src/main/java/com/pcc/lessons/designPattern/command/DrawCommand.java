package com.pcc.lessons.designPattern.command;

public class DrawCommand implements Command {
    private Drawable drawable;
    private int x;
    private  int y;

    public DrawCommand(Drawable drawable, int x, int y) {
        this.drawable = drawable;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        drawable.draw(x,y);
    }

    @Override
    public void add(Command command) {
        throw new RuntimeException("illegal operation add");
    }

    @Override
    public void remove(Command command) {
        throw new RuntimeException("illegal operation remove");
    }
}
