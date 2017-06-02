package 行为型模式.五责任链模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public interface Handler处理者 {
    void handleRequest(String number);

    void setNextHandler(Handler处理者 handler);
}
