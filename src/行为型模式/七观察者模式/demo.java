package 行为型模式.七观察者模式;

/**
 * 别名：依赖、发布-订阅
 * 一对多的关系，一个对象改变，所有依赖于它的对象都得到通知
 * 推数据：具体主题变化后的数据全部交给具体的观察者
 * 拉数据：具体主题不将变化后的数据交给具体的观察者，而是提供了获取这些数据的方法
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Subject主题 subject = new ConcreteSubject具体主题();

        Observer观察者 observer1 = new ConcreteObserver具体观察者1(subject);
        Observer观察者 observer2 = new ConcreteObserver具体观察者2(subject);

        subject.giveNewMess("Hello!");
        subject.notifyObserver();

        subject.giveNewMess("Mess Test!");
        subject.notifyObserver();
    }
}
