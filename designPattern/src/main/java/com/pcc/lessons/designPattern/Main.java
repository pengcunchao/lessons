package com.pcc.lessons.designPattern;

import com.pcc.lessons.designPattern.iterator.ArrayList;
import com.pcc.lessons.designPattern.iterator.Book;
import com.pcc.lessons.designPattern.iterator.Collection;
import com.pcc.lessons.designPattern.iterator.Iterator;

/**
 * 1. Iterator：提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示；将对集合的遍历与集合的具体实现分类。
 * **/
public class Main {
    public static void main(String[] args) {
        Collection<Book> books = new ArrayList<Book>(10);
        books.add(new Book("论语","孔子"));
        books.add(new Book("物种起源","达尔文"));
        books.add(new Book("悲惨世界","雨果"));
        books.add(new Book("三国演义","罗贯中"));
        books.add(new Book("马尔克斯","百年孤独"));
        Iterator<Book> iterator =books.iterator();
        Book temp = null;
        while(iterator.hasNext()){
            temp = iterator.next();
            System.out.println(temp);
        }
        System.out.println("design pattern");
    }
}
