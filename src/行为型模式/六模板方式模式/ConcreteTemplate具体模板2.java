package 行为型模式.六模板方式模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteTemplate具体模板2 extends AbstractTemplate抽象模板 {
    ConcreteTemplate具体模板2(int[] save) {
        super(save);
    }

    @Override
    public void printInfo() {
        System.out.println("for DESC");
    }

    //重写钩子方法，不输出提示信息。
    @Override
    public boolean isInfo() {
        return false;
    }

    @Override
    public void sort() {
        for (int i = 0; i < save.length - 1; i++) {
            for (int j = 0; j < save.length - i - 1; j++) {
                if (save[j] < save[j + 1]) {
                    int temp = save[j];
                    save[j] = save[j + 1];
                    save[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void printAll() {
        for (int aSave : save) {
            System.out.println(aSave);
        }
        System.out.println("");
    }
}
