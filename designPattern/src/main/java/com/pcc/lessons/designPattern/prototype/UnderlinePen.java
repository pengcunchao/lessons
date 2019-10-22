package com.pcc.lessons.designPattern.prototype;

public class UnderlinePen implements Product {
    private char lineChar;

    public UnderlinePen(char lineChar) {
        this.lineChar = lineChar;
    }

    @Override
    public void use(String msg) {
        System.out.print("\"");
        System.out.print(msg);
        System.out.print("\"");
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < msg.getBytes().length; i++) {
            System.out.print(lineChar);
        }
        System.out.print(" ");
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product clone = null;
        try {
            clone = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
