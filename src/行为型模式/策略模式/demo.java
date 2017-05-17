package 行为型模式.策略模式;

/**
 * Created by echosun on 2017/5/17.
 */
public class demo {
    public static void main(String[] args) {
        Context上下文 context=new Context上下文(new ConcreteStategy具体策略1());//创建不同的具体策略
        context.useFun();

        context=new Context上下文(new ConcreteStategy具体策略2());
        context.useFun();
    }

}
