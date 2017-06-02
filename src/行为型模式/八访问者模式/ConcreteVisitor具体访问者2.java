package 行为型模式.八访问者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteVisitor具体访问者2 implements Visitor抽象访问者 {
    @Override
    public boolean visit(Element抽象元素 element) {
        double n = element.show();
        return n > 1000;
    }
}
