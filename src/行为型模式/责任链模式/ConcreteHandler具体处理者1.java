package 行为型模式.责任链模式;

import java.util.ArrayList;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteHandler具体处理者1 implements Handler处理者 {
    private Handler处理者 handler;
    private ArrayList<String> list;

    ConcreteHandler具体处理者1() {
        list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
    }

    @Override
    public void handleRequest(String number) {
        if (list.contains(number)) {
            System.out.println(number + " belong to ConcreteHandler具体处理者1!");
        } else {
            System.out.println(number + " not belong to ConcreteHandler具体处理者1!");
            if (handler != null) {
                handler.handleRequest(number);
            }
        }
    }

    @Override
    public void setNextHandler(Handler处理者 handler) {
        this.handler = handler;
    }
}
