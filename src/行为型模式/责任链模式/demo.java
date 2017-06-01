package 行为型模式.责任链模式;

/**
 * 使多个对象都有机会处理请求，使对象形成链，沿这条链传递请求，直到有一个对象能处理请求。
 * 类似链表。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Handler处理者 handler处理者1 = new ConcreteHandler具体处理者1();//大写
        Handler处理者 handler处理者2 = new ConcreteHandler具体处理者2();//小写
        Handler处理者 handler处理者3 = new ConcreteHandler具体处理者3();//数字

        handler处理者1.setNextHandler(handler处理者2);
        handler处理者2.setNextHandler(handler处理者3);

        handler处理者1.handleRequest("a");
        handler处理者1.handleRequest("A");
        handler处理者1.handleRequest("1");
        handler处理者1.handleRequest("!");
    }

}
