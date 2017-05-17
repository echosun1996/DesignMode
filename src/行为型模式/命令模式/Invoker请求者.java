package 行为型模式.命令模式;

/**
 * 请求者用来存储具体命令，提供方法执行。
 * Created by echosun on 2017/5/17.
 */
public class Invoker请求者 {
    Command命令 command;

    public void setCommand(Command命令 command) {
        this.command = command;
    }

    public void startExecuteCommand() {
        command.execute();
    }
}
