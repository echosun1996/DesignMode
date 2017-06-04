package 结构型模式.七桥接模式;

/**
 * 分离实现和抽象
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Implementor实现者 implementor实现者 = new ConcreteImplementor具体实现者1();
        Abstraction抽象 abstraction抽象 = new RefinedAbstraction细化抽象();
        abstraction抽象.set(implementor实现者);
        abstraction抽象.fun();

        implementor实现者 = new ConcreteImplementor具体实现者2();
        abstraction抽象.set(implementor实现者);
        abstraction抽象.fun();
    }
}
