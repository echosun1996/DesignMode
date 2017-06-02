package 行为型模式.一策略模式;

/**
 * 包含策略变量，提供方法委托策略变量调用策略接口中的方法。
 * Created by echosun.
 * All rights reserved.
 */
class Context上下文 {
    private Strategy策略 state;

    Context上下文(Strategy策略 state) {
        this.state = state;
    }

    void useFun() {
        state.fun();
    }

}
