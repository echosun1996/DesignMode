package 结构型模式.一装饰模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class ConcreteComponent具体组件 extends Component抽象组件 {
    private final int save = 100;

    @Override
    public int fun() {
        return save;
    }
}
