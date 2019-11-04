package com.pcc.lessons.designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConnectionFactory {
    private static final ConnectionFactory connectionFactory = new ConnectionFactory();
    private Map<String,Connection> connections = new HashMap<>();
    private ConnectionFactory(){

    }

    public static ConnectionFactory getInstance(){
        return connectionFactory;
    }

    public Connection getConnection(String url, String userName,String password, String driverClassName) throws ClassNotFoundException {
        String connectionKey = conncetionKey(url, userName, password, driverClassName);
        if(connections.get(connectionKey) == null){
            connections.put(connectionKey,new Connection(url, userName, password, driverClassName));
        }
        return connections.get(connectionKey);
    }

    private String conncetionKey(String url, String userName,String password, String driverClassName){
        return url + userName + password + driverClassName;
    }

}

