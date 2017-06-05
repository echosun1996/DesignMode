package 创建型模式.三生成器模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    public static void main(String[] args) {
        Builder抽象生成器 builder抽象生成器 = new ConcreteBuilder具体生成器1();
        Director指挥者 director指挥者 = new Director指挥者(builder抽象生成器);
        director指挥者.construct();

        builder抽象生成器 = new ConcreteBuilder具体生成器2();
        director指挥者 = new Director指挥者(builder抽象生成器);
        director指挥者.construct();
    }
}
