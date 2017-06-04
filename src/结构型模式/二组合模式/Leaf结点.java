package 结构型模式.二组合模式;

import java.util.Iterator;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class Leaf结点 implements Component抽象组件 {
    private int save;
    private String name;

    Leaf结点(String name, int save) {
        this.name = name;
        this.save = save;
    }

    @Override
    public void add(Component抽象组件 component抽象组件) {

    }

    @Override
    public void remove(Component抽象组件 component抽象组件) {

    }

    @Override
    public Component抽象组件 getChiled(int index) {
        return null;
    }

    @Override
    public Iterator<Component抽象组件> getAllChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public int getSave() {
        return save;
    }

    @Override
    public void setSave(int save) {
        this.save = save;
    }
}
