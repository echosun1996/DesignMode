package 行为型模式.七观察者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteObserver具体观察者 implements Observer观察者{
    private Subject主题 subject;
private int save[];

    public ConcreteObserver具体观察者(Subject主题 subject,int save[]) {
        this.subject=subject;
        subject.addObserver(this);
        this.save=save;
    }

    @Override
    public void hearTelephone(String heardMess) {

    }
}
