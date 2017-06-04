package 结构型模式.二组合模式;

import sun.jvm.hotspot.debugger.win32.coff.COMDATSelectionTypes;

import java.util.Iterator;

/**
 * Created by echosun.
 * All rights reserved.
 */
public interface Component抽象组件 {
    void add(Component抽象组件 component抽象组件);

    void remove(Component抽象组件 component抽象组件);

    Component抽象组件 getChiled(int index);

    Iterator<Component抽象组件> getAllChildren();

    boolean isLeaf();

    int getSave();

    void setSave(int save);
}
