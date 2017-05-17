package 行为型模式.状态模式;

/**
 * Created by echosun on 2017/5/17.
 */
public class demo {
    public static void main(String[] args) {
        Context环境 context=new Context环境();
        context.setSta(new ConcreteState具体状态1());//在环境中设置状态变量
        context.fun();

        context.setSta(new ConcreteState具体状态2());
        context.fun();
    }
}
