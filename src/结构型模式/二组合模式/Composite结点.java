package 结构型模式.二组合模式;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by echosun.
 * All rights reserved.
 */
public class Composite结点 implements Component抽象组件 {
    private LinkedList<Component抽象组件> list;//ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。
    private String name;
    private int save;

    Composite结点(String name, int save) {
        this.name = name;
        this.save = save;
        list = new LinkedList<>();
    }

    @Override
    public void add(Component抽象组件 component抽象组件) {
        list.add(component抽象组件);
    }

    @Override
    public void remove(Component抽象组件 component抽象组件) {
        list.remove(component抽象组件);
    }

    @Override
    public Component抽象组件 getChiled(int index) {
        return list.get(index);
    }

    @Override
    public Iterator<Component抽象组件> getAllChildren() {
        return list.iterator();
    }

    @Override
    public boolean isLeaf() {
        return false;
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
