package 创建型模式.一工厂方法模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteProduct具体产品1 extends Product抽象产品 {
    ConcreteProduct具体产品1() {
        info = "紧急的消息:";
    }

    @Override
    public void fun(String mess) {
        System.out.println(info + mess);

    }
}
