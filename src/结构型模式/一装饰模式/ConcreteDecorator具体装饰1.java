package 结构型模式.一装饰模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class ConcreteDecorator具体装饰1 extends Decorator装饰 {
    private final int addSave = 50;

    ConcreteDecorator具体装饰1(Component抽象组件 component抽象组件) {
        super(component抽象组件);
    }

    @Override
    int fun() {
        return component抽象组件.fun() + addFun();
    }

    @Override
    int addFun() {
        return addSave;
    }
}
