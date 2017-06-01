package 行为型模式.命令模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteCommand具体命令1 implements Command命令 {
    private Receiver接收者1 receiver;

    ConcreteCommand具体命令1(Receiver接收者1 receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.fun1();
    }
}
