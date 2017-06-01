package 行为型模式.状态模式;

/**
 * 状态模式允许在内部修改对象的行为。与策略模式相比，状态的设置通过函数实现。
 * 而策略模式通过构造函数保存，不能改变。
 * Created by echosun.
 * All rights reserved.
 *
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
