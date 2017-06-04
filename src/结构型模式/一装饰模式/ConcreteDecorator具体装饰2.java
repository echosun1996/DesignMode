package 结构型模式.一装饰模式;

/**
 * 测试多个装饰者。
 * Created by echosun.
 * All rights reserved.
 */
class ConcreteDecorator具体装饰2 extends Decorator装饰 {
    private final int addSave = 200;

    ConcreteDecorator具体装饰2(Component抽象组件 component抽象组件) {
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
