package com.pcc.lessons.designPattern.flyweight;

public class Connection {
    private String url;
    private String userName;
    private String password;
    private String driverClassName;

    public Connection(String url, String userName, String password, String driverClassName) throws ClassNotFoundException {
        //Class.forName(driverClassName);
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.driverClassName = driverClassName;
    }

    public  Connection connect(){
        System.out.println(this);
        return this;
    }
}
