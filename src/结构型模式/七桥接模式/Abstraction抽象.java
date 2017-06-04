package 结构型模式.七桥接模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public abstract class Abstraction抽象 {
    Implementor实现者  implementor实现者;
    abstract void set(Implementor实现者 implementor实现者);
    protected abstract void fun();


}
