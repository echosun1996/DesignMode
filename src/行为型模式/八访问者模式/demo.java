package 行为型模式.八访问者模式;

/**
 * 不改变类的前提下定义作用于这些元素的操作
 * 双重分派的技术
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Visitor抽象访问者 visitor = new ConcreteVisitor具体访问者1();//大于100判断

        ConcreteElement具体元素 concreteElement具体元素 = new ConcreteElement具体元素();
        concreteElement具体元素.set(500);
        concreteElement具体元素.accept(visitor);
        visitor = new ConcreteVisitor具体访问者2();//大于1000判断
        concreteElement具体元素.accept(visitor);

        concreteElement具体元素 = new ConcreteElement具体元素();
        concreteElement具体元素.set(2000);
        concreteElement具体元素.accept(visitor);
        visitor = new ConcreteVisitor具体访问者2();//大于1000判断
        concreteElement具体元素.accept(visitor);

    }
}
