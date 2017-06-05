package 创建型模式.四原型模式;

/**
 * 用原型指定创建对象的种类，并通过复制原型创建新的对象
 * Created by echosun.
 * All rights reserved.
 */
class Example implements Cloneable {
    private int save;

    public void setSave(int save) {
        this.save = save;
    }

    public int getSave() {

        return save;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class demo {
    public static void main(String[] args) {
        Example example = new Example();
        example.setSave(1);
        try {
            Example exampleCopy = (Example) example.clone();
            System.out.println("拷贝后copy的数值" + exampleCopy.getSave());
            exampleCopy.setSave(2);
            System.out.println("修改后example的数值" + example.getSave());
            System.out.println("修改后exampleCopy的数值" + exampleCopy.getSave());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
