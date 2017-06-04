package 创建型模式.一工厂方法模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteCreator具体构造者1 extends Creator构造者 {
    @Override
    public Product抽象产品 getProduct抽象产品() {
        return new ConcreteProduct具体产品1();
    }
}
