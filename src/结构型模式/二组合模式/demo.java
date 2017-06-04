package 结构型模式.二组合模式;

import java.util.Iterator;

/**
 * 树形结构，方便地处理个体对象和组合对象。
 * Created by echosun.
 * All rights reserved.
 */
public class demo {
    private static int cul(Component抽象组件 component抽象组件) {
        int sum;
        if (component抽象组件.isLeaf())
            sum = component抽象组件.getSave();
        else {
            sum = component抽象组件.getSave();
            Iterator<Component抽象组件> component抽象组件Iterator = component抽象组件.getAllChildren();
            while (component抽象组件Iterator.hasNext()) {
                Component抽象组件 p = component抽象组件Iterator.next();
                sum += cul(p);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //Cul the sum
        //a:500 --b:600--10*10
        //  |-----c:200--10*2
        //          |----d:100---10*1
        Component抽象组件 a = new Composite结点("a", 500);
        Component抽象组件 b = new Composite结点("b", 600);
        Component抽象组件 c = new Composite结点("c", 200);
        Component抽象组件 d = new Composite结点("d", 100);

        a.add(b);
        for (int i = 0; i < 10; i++) {
            Component抽象组件 leaf = new Leaf结点("leaf", 10);
            b.add(leaf);
        }

        a.add(c);
        for (int i = 0; i < 2; i++) {
            Component抽象组件 leaf = new Leaf结点("leaf", 10);
            c.add(leaf);
        }

        c.add(d);
        for (int i = 0; i < 1; i++) {
            Component抽象组件 leaf = new Leaf结点("leaf", 10);
            d.add(leaf);
        }

        System.out.println(cul(a));
    }
}
