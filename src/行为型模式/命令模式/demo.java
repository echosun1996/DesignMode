package 行为型模式.命令模式;

/**
 * 命令模式：将一个请求封装为一个对象
 * Created by echosun on 2017/5/17.
 */
public class demo {


    public static void main(String[] args) {

        //创建接收者
        Receiver接收者1 receiver接收者1 = new Receiver接收者1();
        Receiver接收者2 receiver接收者2 = new Receiver接收者2();
        //创建请求者
        Invoker请求者 invoker请求者 = new Invoker请求者();
        Command命令 command命令 = new ConcreteCommand具体命令1(receiver接收者1);//创建具体命令并指定接受者
        invoker请求者.setCommand(command命令);//指定接收者
        invoker请求者.startExecuteCommand();

        command命令=new ConcreteCommand具体命令2(receiver接收者2);
        invoker请求者.setCommand(command命令);
        invoker请求者.startExecuteCommand();
    }


}
