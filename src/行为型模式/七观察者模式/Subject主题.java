package 行为型模式.七观察者模式;

/**
 * 主题是关键数据，当该类发生变化时，会通知到所有的观察者
 * Created by echosun.
 * All rights reserved.
 */
public interface Subject主题 {
    void addObserver(Observer观察者 o);

    void DeleteObserver(Observer观察者 o);

    void notifyObserver();

    void giveNewMess(String str);
}
