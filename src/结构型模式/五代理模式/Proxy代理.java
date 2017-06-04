package 结构型模式.五代理模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class Proxy代理 implements Subject抽象主题 {
    private RealSubject实际主题 realSubject实际主题;

    Proxy代理() {
        realSubject实际主题 = new RealSubject实际主题();
    }

    @Override
    public String fun(String str) {
        if (str.contains("y") || str.contains("n"))
            return "contain y or n,could not continue";
        return "enter Real->" + realSubject实际主题.fun(str);
    }
}
