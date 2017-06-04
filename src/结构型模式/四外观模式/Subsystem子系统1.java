package 结构型模式.四外观模式;

/**
 * Created by echosun.
 * All rights reserved.
 */
class Subsystem子系统1 {
    private String save;

    Subsystem子系统1(String save) {
        this.save = save;
    }

    void sub1() {
        System.out.println("This is sub1!Mess:" + save);
    }
}
