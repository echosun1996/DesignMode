package 行为型模式.七观察者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public interface Subject主题 {
    void addObserver(Observer观察者 o);

    void DeleteObserver(Observer观察者 o);

    void notifyObserver();

    void giveNewMess(String str);
}
