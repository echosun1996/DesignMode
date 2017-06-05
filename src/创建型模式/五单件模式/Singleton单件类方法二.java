package 创建型模式.五单件模式;

/**
 * 在单件类提供的类方法里创建这个唯一的实例
 * Created by echosun.
 * All rights reserved.
 */
class Singleton单件类方法二 {
    private int save;

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }


    private static Singleton单件类方法二 uniqueInstance;

    private Singleton单件类方法二() {
        save = 1;
    }

    static synchronized Singleton单件类方法二 getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton单件类方法二();
        return uniqueInstance;
    }

}
