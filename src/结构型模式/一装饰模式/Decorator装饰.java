package 结构型模式.一装饰模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
abstract class Decorator装饰 extends Component抽象组件 {
    Component抽象组件 component抽象组件;

    Decorator装饰(Component抽象组件 component抽象组件) {
        this.component抽象组件 = component抽象组件;
    }

    abstract int addFun();

}
