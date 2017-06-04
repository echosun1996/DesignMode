package 结构型模式.五代理模式;

/**
 * 为对象提供一种代理以控制对这个对象对访问。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        //通过代理过滤掉包含y或n的字符串
        Proxy代理 proxy代理 = new Proxy代理();
        System.out.println(proxy代理.fun("aabb"));
        System.out.println(proxy代理.fun("y"));
    }
}
