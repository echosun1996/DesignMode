package 创建型模式.五单件模式;

/**
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("Method 1:");
        Singleton单件类方法一 demo1 = Singleton单件类方法一.getInstance();
        System.out.println("单件类原来数值" + demo1.getSave());
        demo1.setSave(2);
        System.out.println("单件类修改后数值" + demo1.getSave());
        Singleton单件类方法一 demo2 = Singleton单件类方法一.getInstance();
        System.out.println("相同的单件类数值" + demo2.getSave());

        System.out.println("Method 2:");
        Singleton单件类方法二 demo3 = Singleton单件类方法二.getInstance();
        System.out.println("单件类原来数值" + demo3.getSave());
        demo3.setSave(2);
        System.out.println("单件类修改后数值" + demo3.getSave());
        Singleton单件类方法二 demo4 = Singleton单件类方法二.getInstance();
        System.out.println("相同的单件类数值" + demo4.getSave());
    }
}
