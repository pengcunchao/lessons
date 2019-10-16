package com.pcc.lessons.designPattern.adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;
    private static final String COMMENTS = "Written by FileProperties";

    public FileProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(new File(fileName));
        properties.load(fis);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        properties.store(fos, COMMENTS);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
