package 行为型模式.七观察者模式;

import java.util.ArrayList;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteSubject具体主题 implements Subject主题 {
    private String mess;
    private boolean changed;
    private ArrayList<Observer观察者> list;

    public ConcreteSubject具体主题() {
        list = new ArrayList<>();
        mess = "";
        changed = false;
    }

    @Override
    public void addObserver(Observer观察者 o) {
        if (!list.contains(o)) {
            list.add(o);
        }
    }

    @Override
    public void DeleteObserver(Observer观察者 o) {
        if (list.contains(o)) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        if (changed) {
            for (Observer观察者 observer : list) {
                observer.hearTelephone(mess);
            }
            changed = false;

        }
    }

    @Override
    public void giveNewMess(String str) {
        if (str.equals(mess))
            changed = false;
        else {
            mess = str;
            changed = true;
        }
    }
}
