package 行为型模式.四中介者模式;

import java.util.ArrayList;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteMediator具体中介者 implements Mediator中介者 {

    private ArrayList<Colleague同事> list;

    ConcreteMediator具体中介者() {
        list = new ArrayList<>();
    }

    @Override
    public void registerColleague(Colleague同事 c) {
        list.add(c);
    }

    @Override
    public void deliverMess(String mess, String... person) {
        Colleague同事 c;
        for (String aPerson : person) {
            for (Colleague同事 aList : list) {
                c = aList;
                if (c.getName().equals(aPerson)) {
                    c.receiverMess(mess);//同事的name匹配person则同事接受
                }
            }
        }
    }
}
