package 创建型模式.二抽象工厂模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteProduct具体产品21 extends Product抽象产品2 {
    private String type;
    private int save2;

    ConcreteProduct具体产品21() {
        type = "产品2";
        save2 = 1;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setSave2(int save2) {
        this.save2 = save2;
    }

    @Override
    public void make2() {
        System.out.println("生产" + type + ",具体类型" + save2);
    }
}
