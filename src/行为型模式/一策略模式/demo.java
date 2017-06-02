package 行为型模式.一策略模式;

/**
 * 通过上下文来调用具体策略的方法。常用在一个算法的不同变体。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Context上下文 context=new Context上下文(new ConcreteStategy具体策略1());//创建不同的具体策略
        context.useFun();

        context=new Context上下文(new ConcreteStategy具体策略2());
        context.useFun();
    }

}
