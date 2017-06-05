package 创建型模式.三生成器模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteBuilder具体生成器2 implements Builder抽象生成器 {
    private Product产品 product产品;

    ConcreteBuilder具体生成器2() {
        product产品 = new Product产品();
    }

    @Override
    public void buildA() {
        product产品.a = 2;
    }

    @Override
    public void buildB() {
        product产品.b = 2;
    }

    @Override
    public void buildC() {
        product产品.c = 2;
    }

    @Override
    public void get() {
        System.out.println("a:" + product产品.a + "b:" + product产品.b + "c:" + product产品.c);
    }
}
