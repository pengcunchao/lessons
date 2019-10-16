package com.pcc.lessons.designPattern.templateMethod;

public class CharDisplay extends AbstractDisplay {
    private char aChar;
    public CharDisplay() {
    }

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(aChar);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
