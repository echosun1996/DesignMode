package 行为型模式.模板方式模式;

/**
 * 不改变算法结构，重定义算法内某些特定步骤。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {

    public static void main(String[] args) {
        int s[] = {23, 42, 132, 5, 1, 14, 3, 52, 34, 2, 4};

        AbstractTemplate抽象模板 template = new ConcreteTemplate具体模板1(s);
        template.templateMethod();

        template = new ConcreteTemplate具体模板2(s);
        template.templateMethod();

    }

}
