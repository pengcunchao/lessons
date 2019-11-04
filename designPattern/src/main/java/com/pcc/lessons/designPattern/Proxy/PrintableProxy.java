package com.pcc.lessons.designPattern.Proxy;

public class PrintableProxy implements Printable{
    private String name;
    private Printable real;
    private String realClazzName;

    public PrintableProxy(String name, String realClazzName) {
        this.name = name;
        this.realClazzName = realClazzName;
    }

    public PrintableProxy(String name) {
        this.name = name;
    }

    public PrintableProxy() {
    }

    public String getRealClazzName() {
        return realClazzName;
    }

    public void setRealClazzName(String realClazzName) {
        this.realClazzName = realClazzName;
    }

    @Override
    public void print() {
        if(real == null){
            try {
                real = PrintableFactory.create(realClazzName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

        real.print();

    }

    @Override
    public void setName(String name) {
        if(real != null){
            real.setName(name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
