package com.pcc.lessons.designPattern.decorator;

public class Boarder extends Display {
    private Display display;
    private char horizonChar;
    private char verticalChar;

    public Boarder(Display display, char horizonChar, char verticalChar) {
        this.display = display;
        this.horizonChar = horizonChar;
        this.verticalChar = verticalChar;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setHorizonChar(char horizonChar) {
        this.horizonChar = horizonChar;
    }

    public void setVerticalChar(char verticalChar) {
        this.verticalChar = verticalChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return getLine(horizonChar);
        }
        else if(row > 0 && row < getRows() - 1){
            return verticalChar + display.getRowText(row - 1) + verticalChar;
        }
        else if(row == getRows() - 1){
            return getLine(horizonChar);
        }
        else{
            return null;
        }
    }

    private String getLine(char lineChar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getColumns(); i++) {
            sb.append(lineChar);
        }
        return sb.toString();
    }
}
