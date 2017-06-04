package 结构型模式.七桥接模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class RefinedAbstraction细化抽象 extends Abstraction抽象 {
    @Override
    void set(Implementor实现者 implementor实现者) {
        this.implementor实现者 = implementor实现者;
    }

    @Override
    protected void fun() {
        System.out.println(this.implementor实现者.start());
    }
}
