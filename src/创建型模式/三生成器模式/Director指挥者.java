package 创建型模式.三生成器模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class Director指挥者 {
    private Builder抽象生成器 builder抽象生成器;

    Director指挥者(Builder抽象生成器 builder抽象生成器) {
        this.builder抽象生成器 = builder抽象生成器;
    }

    void construct() {
        builder抽象生成器.buildA();
        builder抽象生成器.buildB();
        builder抽象生成器.buildC();
        builder抽象生成器.get();
    }
}
