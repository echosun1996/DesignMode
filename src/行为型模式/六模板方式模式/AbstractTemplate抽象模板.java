package 行为型模式.六模板方式模式;

/**
 * 附加钩子方法的示例
 * 如果不希望子类重写方法，需要用final修饰
 * Created by echosun.
 * All rights reserved.
 */
public abstract class AbstractTemplate抽象模板 {
    int[] save;

    AbstractTemplate抽象模板(int[] save) {
        this.save = save;
    }

    final void templateMethod() {
        sort();
        if (isInfo())//挂钩处
        {
            printInfo();//输出是正序还是倒序输出
        }
        printAll();
    }

    public abstract void printInfo();

    public abstract void sort();

    public abstract void printAll();

    //钩子方法，默认是输出提示信息
    public boolean isInfo() {
        return true;
    }
}
