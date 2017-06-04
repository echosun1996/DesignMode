package 创建型模式.二抽象工厂模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
/*
 |--抽象产品1---具体产品11
-|           |-具体产品12
 |
 |--抽象产品2---具体产品21
             |-具体产品22

 用具体工厂1生产具体产品11和具体产品21
 用具体工厂2生产具体产品12和具体产品22

 实例：产品1是上装，产品2是下装，用具体工厂组成套装
 */
public class demo {
    public static void main(String[] args) {
        AbstractFactory抽象工厂 abstractFactory抽象工厂 = new ConcreteFactory具体工厂1();
        Product抽象产品1 product抽象产品1;
        Product抽象产品2 product抽象产品2;

        System.out.println("生产具体类型1");
        product抽象产品1 = abstractFactory抽象工厂.createProduct抽象产品1();
        product抽象产品2 = abstractFactory抽象工厂.createProduct抽象产品2();
        product抽象产品1.make1();
        product抽象产品2.make2();

        System.out.println("生产具体类型2");
        abstractFactory抽象工厂 = new ConcreteFactory具体工厂2();
        product抽象产品1 = abstractFactory抽象工厂.createProduct抽象产品1();
        product抽象产品2 = abstractFactory抽象工厂.createProduct抽象产品2();
        product抽象产品1.make1();
        product抽象产品2.make2();
    }

}
