package 行为型模式.策略模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteStategy具体策略1 implements Strategy策略{

    @Override
    public void fun() {
        System.out.println("这是具体策略1的实现");
    }
}
