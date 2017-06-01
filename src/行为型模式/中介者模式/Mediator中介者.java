package 行为型模式.中介者模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public interface Mediator中介者 {
    void registerColleague(Colleague同事 c);
    void deliverMess(String mess, String... person);

}
