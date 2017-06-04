package 结构型模式.三适配器模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class Adapter适配器 implements Target目标 {
    private Adaptee被适配器 adaptee被适配器;

    Adapter适配器(Adaptee被适配器 adaptee被适配器) {
        this.adaptee被适配器 = adaptee被适配器;
    }

    @Override
    public String userTarget() {
        String old = adaptee被适配器.userTarget();
        return old + "转变成新方法";
    }
}
