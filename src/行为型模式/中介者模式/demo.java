package 行为型模式.中介者模式;

/**
 * 用中介对象来封装对象交互。方便的修改同事间交互。解耦合。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        //创建中介者,通过中介者来处理、分发所有的消息。
        Mediator中介者 mediator = new ConcreteMediator具体中介者();

        Colleague同事 ca = new ConcreteColleague具体同事();
        Colleague同事 cb = new ConcreteColleague具体同事();
        Colleague同事 c1 = new ConcreteColleague具体同事();
        Colleague同事 c2 = new ConcreteColleague具体同事();

        //绑定中介，这里四个具体同事共用了一个中介者
        ca.setMediator(mediator);
        cb.setMediator(mediator);
        c1.setMediator(mediator);
        c2.setMediator(mediator);

        //中介者通过名字来发送消息
        ca.setName("ca");
        cb.setName("cb");
        c1.setName("c1");
        c2.setName("c2");

        ca.giveMess("hello~c1,c2!this is ca.", "c1", "c2");
        cb.giveMess("hello~c1,c2!this is cb.", "c1", "c2");

        c1.giveMess("hello ca", "ca");
        c2.giveMess("hello cb", "cb");


    }
}
