package com.pcc.lessons.designPattern;

import com.pcc.lessons.designPattern.abstractFactory.IFactory;
import com.pcc.lessons.designPattern.abstractFactory.XiaomiFactory;
import com.pcc.lessons.designPattern.adapter.FileIO;
import com.pcc.lessons.designPattern.adapter.FileProperties;
import com.pcc.lessons.designPattern.builder.Article;
import com.pcc.lessons.designPattern.builder.HtmlBuilder;
import com.pcc.lessons.designPattern.builder.PlainTextBuilder;
import com.pcc.lessons.designPattern.command.Command;
import com.pcc.lessons.designPattern.command.DrawCommand;
import com.pcc.lessons.designPattern.command.Drawable;
import com.pcc.lessons.designPattern.command.MacroCommand;
import com.pcc.lessons.designPattern.command.RadioDrawer;
import com.pcc.lessons.designPattern.composite.Directory;
import com.pcc.lessons.designPattern.composite.Entry;
import com.pcc.lessons.designPattern.composite.File;
import com.pcc.lessons.designPattern.decorator.Boarder;
import com.pcc.lessons.designPattern.decorator.Display;
import com.pcc.lessons.designPattern.facade.SecurityFacade;
import com.pcc.lessons.designPattern.factoryMethod.AppleFactory;
import com.pcc.lessons.designPattern.factoryMethod.Fruit;
import com.pcc.lessons.designPattern.flyweight.Connection;
import com.pcc.lessons.designPattern.flyweight.ConnectionFactory;
import com.pcc.lessons.designPattern.iterator.ArrayList;
import com.pcc.lessons.designPattern.iterator.Book;
import com.pcc.lessons.designPattern.iterator.Collection;
import com.pcc.lessons.designPattern.iterator.Iterator;
import com.pcc.lessons.designPattern.mediator.AntFarmMediator;
import com.pcc.lessons.designPattern.mediator.Mediator;
import com.pcc.lessons.designPattern.prototype.Product;
import com.pcc.lessons.designPattern.prototype.ProductManager;
import com.pcc.lessons.designPattern.prototype.UnderlinePen;
import com.pcc.lessons.designPattern.responsibilityChain.EvenSupport;
import com.pcc.lessons.designPattern.responsibilityChain.LimitSupport;
import com.pcc.lessons.designPattern.responsibilityChain.NoSupport;
import com.pcc.lessons.designPattern.responsibilityChain.OddSupport;
import com.pcc.lessons.designPattern.responsibilityChain.Support;
import com.pcc.lessons.designPattern.responsibilityChain.Trouble;
import com.pcc.lessons.designPattern.singleton.Singleton;
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
 * 创建型模式：factory method, abstract factory, builder, prototype, singleton（对象的创建）
 * 结构型模式：adapter,proxy,decorator,composite,facade,bridge,flyweight(对象的组成和对象之间的依赖关系)
 * 1. Iterator：提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示；将对集合的遍历与集合的具体实现分类。
 * 2. Composite: 使内容和容器具有一致性，统一内容和容器的处理。一般来说，树结构都可以使用Composite模式
 * 3. Visitor模式：数据结构与数据的处理分离
 * 4. Adapter: 在完全不改变现有代码的前提下使现有代码适配新的接口（协调不兼容接口间的工作）
 * 5. Template Method: 在父类中定义处理流程的框架，子类中实现具体处理
 * 6. Strategy: 将算法和程序的其他部分分离，在程序中以委托的方式使用算法，方便整体替换算法
 * 7. Mediator: 涉及多个对象之间的关系，不让各个对象之间相互通信，而是增加一个Mediator角色，让他们各自与Mediator通信。对象向Mediator报告，Mediator通知对象执行相应的命令。
 * 8. State: 不同的state不同的处理，将State封装成对象，和state相关的处理封装在State中。
 * 9. Factory Method: Template Method用于创建对象。
 * 10. Singleton: 确保程序在运行的过程中只有唯一的一个实例
 * 11. Prototype: 根据实例生成实例
 * 12. Builder:
 * 13. Abstract Factory: 将抽象零件组装成抽象产品
 * 14. Bridge: 将类的功能层次结构和实现层次结构解耦。当一个类存在两个独立变化维度时，可以将变化的维度抽象化，再用关联方式将其联系起来。
 * 15. Decorator:
 * 16. flyweight: 通过尽量共享实例来避免new出实例，flyweight对象中只应该存放intrinsic信息，extrinsic信息作为方法参数传递
 * 17. proxy:
 * 18. facade模式：
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

        System.out.println("the eventId '759_bml_cta_abc123xxx' does not exist.".matches("the eventId.*does not exist."));
        //factory method
        Fruit apple = new AppleFactory().create("hongfushi");
        System.out.println(apple);

        //Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);

        //prototype
        ProductManager productManager = new ProductManager();
        Product underLinePen = new UnderlinePen('-');

        productManager.register("underlinePen",underLinePen);
        productManager.create("underlinePen").use("hello");

        //builder
        String head = "this is head";
        String tail = "this is tail";
        String body = "this is body";
        Article html=  new HtmlBuilder().head(head).body(body).tail(tail).build();
        Article text=  new PlainTextBuilder().head(head).body(body).tail(tail).build();
        System.out.println(html);
        System.out.println(text);

        //abstract factory
        IFactory appleFactory = new com.pcc.lessons.designPattern.abstractFactory.AppleFactory();
        appleFactory.createComputer("air 13");
        appleFactory.createPhone("6 plus");
        appleFactory.createWatch("12");

        IFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.createComputer("mi6");
        xiaomiFactory.createPhone("mi6");
        xiaomiFactory.createWatch("mi6");

        Display display = new com.pcc.lessons.designPattern.decorator.StringDisplay("hello world;\nhello china!\nwow,how wonderful!!!!");
        Boarder boarder = new Boarder(display,'-','|');
        boarder.show();

        //flyweight
        ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
        Connection connection = connectionFactory.getConnection("jdbc:mysql://192.168.0.105;3306/XXX","root","root","com.mysql.jdbc.mysql");
        connection.connect();

        Connection connection1 = connectionFactory.getConnection("jdbc:mysql://192.168.0.105;3306/XXX","root","root","com.mysql.jdbc.mysql");
        connection1.connect();

        //facade
        SecurityFacade securityFacade = SecurityFacade.getInstance();
        securityFacade.alarm();
        securityFacade.monitor();

        //command
        Drawable drawer = new RadioDrawer(10);
        Command command1 = new DrawCommand(drawer,50,50);
        Command command2 = new DrawCommand(drawer,100,100);
        Command commands = new MacroCommand();
        commands.add(command1);
        commands.add(command2);
        commands.execute();

        //responsibility chain
        Support noSupport = new NoSupport("noSupport");
        Support oddSupport = new OddSupport("oddSupport");
        Support evenSupportSupport = new EvenSupport("evenSupport");
        Support limitSupport = new LimitSupport("limitSupport", 5,100);

        noSupport.setNextAndReturn(limitSupport).setNextAndReturn(evenSupportSupport).setNextAndReturn(oddSupport);

        Trouble trouble = new Trouble(2);
        Trouble trouble1 = new Trouble(10);
        Trouble trouble2 = new Trouble(101);
        Trouble trouble3 = new Trouble(108);
        noSupport.support(trouble);
        noSupport.support(trouble1);
        noSupport.support(trouble2);
        noSupport.support(trouble3);

    }
}
