package 结构型模式.四外观模式;

/**
 * 外观只提供简介的界面。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Facade外观 facade外观 = new Facade外观("hello");
        facade外观.doFacade();
    }
}
