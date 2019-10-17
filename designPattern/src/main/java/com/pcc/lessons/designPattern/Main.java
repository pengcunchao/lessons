package com.pcc.lessons.designPattern;

import com.pcc.lessons.designPattern.adapter.FileIO;
import com.pcc.lessons.designPattern.adapter.FileProperties;
import com.pcc.lessons.designPattern.composite.Directory;
import com.pcc.lessons.designPattern.composite.Entry;
import com.pcc.lessons.designPattern.composite.File;
import com.pcc.lessons.designPattern.iterator.ArrayList;
import com.pcc.lessons.designPattern.iterator.Book;
import com.pcc.lessons.designPattern.iterator.Collection;
import com.pcc.lessons.designPattern.iterator.Iterator;
import com.pcc.lessons.designPattern.mediator.AntFarmMediator;
import com.pcc.lessons.designPattern.mediator.Mediator;
import com.pcc.lessons.designPattern.state.AloneState;
import com.pcc.lessons.designPattern.state.Chick;
import com.pcc.lessons.designPattern.state.VisitorState;
import com.pcc.lessons.designPattern.strategy.InsertionSorter;
import com.pcc.lessons.designPattern.strategy.SelectionSorter;
import com.pcc.lessons.designPattern.strategy.SortAndPrinter;
import com.pcc.lessons.designPattern.templateMethod.AbstractDisplay;
import com.pcc.lessons.designPattern.templateMethod.CharDisplay;
import com.pcc.lessons.designPattern.templateMethod.StringDisplay;
import com.pcc.lessons.designPattern.visitor.Reader;
import com.pcc.lessons.designPattern.visitor.Visitor;

import java.util.Properties;

/**
 * 1. Iterator：提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示；将对集合的遍历与集合的具体实现分类。
 * 2. Composite: 使内容和容器具有一致性，统一内容和容器的处理。一般来说，树结构都可以使用Composite模式
 * 3. Visitor模式：数据结构与数据的处理分离
 * 4. Adapter: 在完全不改变现有代码的前提下使现有代码适配新的接口
 * 5. Template Method: 在父类中定义处理流程的框架，子类中实现具体处理
 * 6. Strategy: 将算法和程序的其他部分分离，在程序中以委托的方式使用算法，方便整体替换算法
 * **/
public class Main {
    public static void main(String[] args) throws Exception {
        //Iterator
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

        //composite
        Entry directory = new Directory("usr",0);
        directory.add(new File("root",10));
        directory.add(new File("pcc",20));

        Entry admin = new Directory("admin",0);
        admin.add(new File("admin1",5));
        directory.add(admin);
        //visitor
        Visitor visitor = new Reader();
        directory.accept(visitor);

        //adapter
        FileIO fileIO = new FileProperties(new Properties());
        fileIO.readFromFile("file.txt");
        fileIO.setValue("year", "2004");
        fileIO.setValue("month", "4");
        fileIO.setValue("day", "21");
        fileIO.writeToFile("newFile.txt");

        //template method
        AbstractDisplay abstractDisplay = new CharDisplay('h');
        AbstractDisplay stringDisplay = new StringDisplay("hello world");
        abstractDisplay.show();
        stringDisplay.show();

        //Strategy
        Integer[] scores = new Integer[]{100, 50, 88, 69, 99};
        String[] lessons = new String[]{"language", "math", "english", "history", "physics"};
        SortAndPrinter<Integer> scoresPrinter = new SortAndPrinter<>(new SelectionSorter<>(), scores);
        SortAndPrinter<String> lessonsPrinter = new SortAndPrinter<>(new InsertionSorter<>(), lessons);
        scoresPrinter.sortAndPrint();
        lessonsPrinter.sortAndPrint();

        //mediator
        Mediator mediator = new AntFarmMediator();
        VisitorState visitorState = new VisitorState(mediator);
        AloneState aloneState = new AloneState(mediator);
        ((AntFarmMediator) mediator).setAloneState(aloneState);
        ((AntFarmMediator) mediator).setAloneState(aloneState);
        Chick chick = new Chick(aloneState);
        ((AntFarmMediator) mediator).setChick(chick);
        chick.invite(new Chick(new AloneState(null)));
    }
}
