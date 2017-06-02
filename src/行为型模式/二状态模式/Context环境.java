package 行为型模式.二状态模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class Context环境 {
    private State抽象状态 state;

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
