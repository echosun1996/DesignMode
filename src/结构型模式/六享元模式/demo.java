package 结构型模式.六享元模式;

/**
 * 运用共享技术有效地支持大量细粒度对象
 * 可以节省内存开销。享元可在不同环境中共享。
 * Created by echosun.
 * All rights reserved.
 */

class useFlyweight {
    private Flyweight享元接口 flyweight享元接口;
    private String info;

    useFlyweight(Flyweight享元接口 flyweight享元接口, String info) {
        this.flyweight享元接口 = flyweight享元接口;
        this.info = info;
    }

    void dis() {
        System.out.println(info);
        System.out.println(flyweight享元接口.getA());
        System.out.println(flyweight享元接口.getB());
        System.out.println(flyweight享元接口.getC());
    }
}

public class demo {
    public static void main(String[] args) {

        FlyweightFactory享元工厂 flyweightFactory享元工厂 = FlyweightFactory享元工厂.getFlyweightFactory();
        Flyweight享元接口 flyweight享元接口 = flyweightFactory享元工厂.getFlyweight();

        useFlyweight a = new useFlyweight(flyweight享元接口, "this is the test:");
        a.dis();

        useFlyweight b = new useFlyweight(flyweight享元接口, "this is the next test:");
        b.dis();
    }


}
