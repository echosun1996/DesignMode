package 结构型模式.五代理模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class RealSubject实际主题 implements Subject抽象主题 {
    @Override
    public String fun(String str) {
        if (str.contains("1"))
            return "contain 1";
        else if (str.contains("a"))
            return "contain a";
        else
            return "not contain 1";
    }
}
