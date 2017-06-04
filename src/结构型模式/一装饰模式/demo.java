package 结构型模式.一装饰模式;

/**
 * 动态的给对象添加一些额外的职责。
 * 不必修改具体组件，就可以增加新的针对具体组件的具体装饰。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Component抽象组件 component抽象组件 = new ConcreteComponent具体组件();
        System.out.println("原始数值：" + component抽象组件.fun());

        component抽象组件 = new ConcreteDecorator具体装饰1(component抽象组件);
        System.out.println("增加一个50的装饰漆后的数值：" + component抽象组件.fun());

        component抽象组件 = new ConcreteDecorator具体装饰2(component抽象组件);
        System.out.println("增加一个200的装饰漆后的数值：" + component抽象组件.fun());
    }
}
