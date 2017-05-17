package 行为型模式.状态模式;

/**
 * Created by echosun on 2017/5/17.
 */
public class ConcreteState具体状态1 implements State抽象状态 {
    public void handle() {
        System.out.println("这是具体状态1");
    }
}
