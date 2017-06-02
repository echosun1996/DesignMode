package 行为型模式.八访问者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public abstract class Element抽象元素 {
    public abstract void accept(Visitor抽象访问者 visitor);

    public abstract int show();

    public abstract void set(int n);
}
