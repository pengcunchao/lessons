package com.pcc.lessons.designPattern.builder;

public class Article {
    private String head;
    private String tail;
    private String body;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return head + "\n" + body + "\n" + tail;
    }
}
