package 行为型模式.策略模式;

/**
 * 包含策略变量，提供方法委托策略变量调用策略接口中的方法。
 * Created by echosun on 2017/5/17.
 */
public class Context上下文 {
    Strategy策略 state;

    public Context上下文(Strategy策略 state) {
        this.state = state;
    }

    public void useFun() {
        state.fun();
    }

}
