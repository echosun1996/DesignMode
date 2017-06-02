package 行为型模式.四中介者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public interface Colleague同事 {
    void giveMess(String mess, String... person);
    void receiverMess(String mess);
    void setName(String s);
    String getName();
    void setMediator(Mediator中介者 mediator);
}
