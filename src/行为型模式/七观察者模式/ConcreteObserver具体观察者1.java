package 行为型模式.七观察者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteObserver具体观察者1 implements Observer观察者 {
    private Subject主题 subject;

    ConcreteObserver具体观察者1(Subject主题 subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void hear(String heardMess) {
        System.out.println("我是具体观察者1，我收到了消息：" + heardMess);
    }
}
