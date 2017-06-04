package 创建型模式.二抽象工厂模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteProduct具体产品11 extends Product抽象产品1 {
    private String type;
    private int save1;

    ConcreteProduct具体产品11() {
        type = "产品1";
        save1 = 1;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setSave1(int save1) {
        this.save1 = save1;
    }

    @Override
    public void make1() {
        System.out.println("生产" + type + ",具体类型" + save1);

    }
}
