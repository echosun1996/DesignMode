package 行为型模式.三命令模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteCommand具体命令2 implements Command命令 {
    private Receiver接收者2 receiver;

    ConcreteCommand具体命令2(Receiver接收者2 receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.fun2();
    }
}
