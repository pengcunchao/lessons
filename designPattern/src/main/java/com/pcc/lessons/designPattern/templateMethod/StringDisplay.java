package com.pcc.lessons.designPattern.templateMethod;

public class StringDisplay extends AbstractDisplay {
    private String content;
    private int width;

    public StringDisplay(String content) {
        this.content = content;
        this.width = content.getBytes().length;
    }

    @Override
    public void open() {
        for (int i = 0; i < width; i++) {
            System.out.print('+');
        }
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public void close() {
        for (int i = 0; i < width; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
