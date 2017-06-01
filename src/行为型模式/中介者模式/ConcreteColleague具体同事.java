package 行为型模式.中介者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteColleague具体同事 implements Colleague同事 {
    private Mediator中介者 mediator;
    private String name;

    @Override
    public void giveMess(String mess, String... person) {

        String s = name + " give Mess: " + mess;
        mediator.deliverMess(s, person);
    }

    @Override
    public void receiverMess(String mess) {
        System.out.println(name + " receive " + mess);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMediator(Mediator中介者 mediator) {
        this.mediator = mediator;
        mediator.registerColleague(this);
    }
}
