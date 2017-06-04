package 创建型模式.一工厂方法模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class MessMange {
    private Product抽象产品 product抽象产品;

    void setProduct抽象产品(Product抽象产品 product抽象产品) {
        this.product抽象产品 = product抽象产品;
    }

    void use(String s) {
        product抽象产品.fun(s);
    }
}

public class demo {
    public static void main(String[] args) {
        Product抽象产品 product抽象产品;//消息内容
        Creator构造者 creator构造者;//返回具体消息
        MessMange messMange = new MessMange();//消息

        creator构造者 = new ConcreteCreator具体构造者1();
        product抽象产品 = creator构造者.getProduct抽象产品();
        messMange.setProduct抽象产品(product抽象产品);
        messMange.use("hello");

        creator构造者 = new ConcreteCreator具体构造者2();
        product抽象产品 = creator构造者.getProduct抽象产品();
        messMange.setProduct抽象产品(product抽象产品);
        messMange.use("world");


    }
}
