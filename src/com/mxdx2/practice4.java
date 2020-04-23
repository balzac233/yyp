package com.mxdx2;
/**
 * 练习4
 *
 * @Author: wwb
 * @Date: 2020/4/15 20:55
 */
abstract public class practice4 {
    //    abstract void open();
//    abstract void close();
    public static void main(String[] args) {
        System.out.println("第四题");
    }
}

abstract class Door {
    abstract void open();
    abstract void close();
}

interface FireSafe {
    void fireProof();
}

interface BulletSafe {
    void bulletProof();
}
//防火门
class FireProofDoor extends Door implements FireSafe{

    @Override
    void open() {
        System.out.println("打开防火门");
    }

    @Override
    void close() {
        System.out.println("关闭防火门！！！");
    }

    @Override
    public void fireProof() {
        System.out.println("开始防火");
    }
}
//防弹门
class BulletProofDoor extends Door implements BulletSafe{

    @Override
    void open() {
        System.out.println("打开防弹门");
    }

    @Override
    void close() {
        System.out.println("关闭防弹门！！！");
    }

    @Override
    public void bulletProof() {
        System.out.println("FBI OPEN THE DOOR!!!");
    }
}
