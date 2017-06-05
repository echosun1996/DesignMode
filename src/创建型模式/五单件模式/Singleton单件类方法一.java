package 创建型模式.五单件模式;

/**
 * 在JVM加载单件类时创建它的唯一实例
 * Created by echosun.
 * All rights reserved.
 */
class Singleton单件类方法一 {
    private int save;

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    private static Singleton单件类方法一 uniqueInstance = new Singleton单件类方法一();

    private Singleton单件类方法一() {
        save = 1;
    }

    static Singleton单件类方法一 getInstance() {
        return uniqueInstance;
    }

}
