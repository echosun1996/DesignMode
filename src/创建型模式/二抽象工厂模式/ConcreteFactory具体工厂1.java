package 创建型模式.二抽象工厂模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteFactory具体工厂1 extends AbstractFactory抽象工厂 {

    @Override
    public Product抽象产品1 createProduct抽象产品1() {
        return new ConcreteProduct具体产品11();
    }

    @Override
    public Product抽象产品2 createProduct抽象产品2() {
        return new ConcreteProduct具体产品21();
    }
}
