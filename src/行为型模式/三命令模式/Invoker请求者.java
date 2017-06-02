package 行为型模式.三命令模式;

/**
 * 请求者用来存储具体命令，提供方法执行。
 * Created by echosun.
 * All rights reserved.
 */
class Invoker请求者 {
    private Command命令 command;

    void setCommand(Command命令 command) {
        this.command = command;
    }

    void startExecuteCommand() {
        command.execute();
    }
}
