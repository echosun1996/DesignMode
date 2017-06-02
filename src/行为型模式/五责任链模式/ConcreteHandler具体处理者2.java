package 行为型模式.五责任链模式;

import java.util.ArrayList;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteHandler具体处理者2 implements Handler处理者 {
    private Handler处理者 handler;
    private ArrayList<String> list;

    ConcreteHandler具体处理者2() {
        list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    @Override
    public void handleRequest(String number) {
        if (list.contains(number)) {
            System.out.println(number + " belong to ConcreteHandler具体处理者2!");
        } else {
            System.out.println(number + " not belong to ConcreteHandler具体处理者2!");
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
