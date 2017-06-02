package 行为型模式.八访问者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteElement具体元素 extends Element抽象元素 {

    private int save;

    @Override
    public void accept(Visitor抽象访问者 visitor) {
        boolean n = visitor.visit(this);
        System.out.println("判断结果：" + n);
    }

    @Override
    public int show() {
        return save;
    }

    @Override
    public void set(int n) {
        save = n;
    }
}
