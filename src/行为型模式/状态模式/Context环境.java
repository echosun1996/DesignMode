package 行为型模式.状态模式;

/**
 * Created by echosun on 2017/5/17.
 */
public class Context环境 {
    State抽象状态 state;

    void setSta(State抽象状态 in) {
        state = in;
    }

    void fun() {
        if (state != null) {
            state.handle();
        } else
            System.out.println("no state exist!");
    }
}
