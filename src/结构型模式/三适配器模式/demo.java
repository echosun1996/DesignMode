package 结构型模式.三适配器模式;

/**
 * 接口转换，使不兼容的接口可以一起工作。
 * Created by echosun.
 * All rights reserved.
 */

class test implements Adaptee被适配器 {

    @Override
    public String userTarget() {
        return "old way";
    }
}

public class demo {
    public static void main(String[] args) {
        Adaptee被适配器 adaptee被适配器 = new test();
        System.out.println(adaptee被适配器.userTarget());

        Adapter适配器 adapter适配器 = new Adapter适配器(adaptee被适配器);
        System.out.println(adapter适配器.userTarget());

    }
}
