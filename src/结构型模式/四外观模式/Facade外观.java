package 结构型模式.四外观模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class Facade外观 {
    private Subsystem子系统1 subsystem子系统1;
    private Subsystem子系统2 subsystem子系统2;

    Facade外观(String save) {
        subsystem子系统1 = new Subsystem子系统1(save);
        subsystem子系统2 = new Subsystem子系统2();
    }

    void doFacade() {
        subsystem子系统1.sub1();
        subsystem子系统2.sub2();
    }
}
