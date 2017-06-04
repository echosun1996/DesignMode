package 结构型模式.六享元模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class FlyweightFactory享元工厂 {
    private static FlyweightFactory享元工厂 flyweightFactory享元工厂 = new FlyweightFactory享元工厂();

    private FlyweightFactory享元工厂() {
    }

    static FlyweightFactory享元工厂 getFlyweightFactory() {
        return flyweightFactory享元工厂;
    }

    Flyweight享元接口 getFlyweight() {
        return new ConcreteFlyweight具体享元(1, 2, 3);
    }
}

//由于享元外不允许修改享元内容，因此需要将具体享元作为内部类
class ConcreteFlyweight具体享元 implements Flyweight享元接口 {
    ConcreteFlyweight具体享元(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int a;
    private int b;
    private int c;

    @Override
    public int getA() {
        return a;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public int getC() {
        return c;
    }
}