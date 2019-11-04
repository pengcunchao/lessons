package com.pcc.lessons.designPattern.Proxy;

public class PrintableFactory {
    public static Printable create(String clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Printable) Class.forName(clazz).newInstance();
    }
}
