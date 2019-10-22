package com.pcc.lessons.designPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private Map<String,Product> protos = new HashMap<>();

    public void register(String name, Product proto){
        protos.put(name,proto);
    }
    public Product create(String protoName){
        return protos.get(protoName).createClone();
    }
}
