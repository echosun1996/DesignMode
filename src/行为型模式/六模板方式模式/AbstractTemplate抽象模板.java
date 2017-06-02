package 行为型模式.六模板方式模式;

/**
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
        printAll();
    }

    public abstract void sort();

    public abstract void printAll();
}
