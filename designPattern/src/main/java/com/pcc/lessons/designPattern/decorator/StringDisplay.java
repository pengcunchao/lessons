package com.pcc.lessons.designPattern.decorator;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringDisplay extends Display {
    private String content;
    Map<Integer, String> rowsString = new HashMap<>();
    private int column = 0;
    private int row = 0;

    public StringDisplay(String content) throws IOException {
        this.content = content;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(content.getBytes())));
        int index = 0;
        String rowString = null;
        while ((rowString = bufferedReader.readLine()) != null) {
            rowsString.put(index,rowString);
            if(rowString.getBytes().length > column){
                column = rowString.getBytes().length;
            }
            index ++;
        }

        row = index;
    }

    @Override
    public int getColumns() {
        return column;
    }

    @Override
    public int getRows() {
        return row;
    }

    @Override
    public String getRowText(int row) {
        return rowsString.get(row);
    }
}
