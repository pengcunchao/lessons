package com.pcc.lessons.designPattern.command;

public class RadioDrawer implements Drawable {
    private int radio;

    public RadioDrawer(int radio) {
        this.radio = radio;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw radio at" + '(' + x + ',' + y + ')' + " with length " + radio);
    }
}
