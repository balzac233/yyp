package com.mxdx2;

/**
 * 练习3
 *
 * @Author: wwb
 * @Date: 2020/4/15 18:33
 */
public interface practice3 {
    public static void main(String[] args) {
        System.out.println("接口放外面算了");
    }
}

interface Vehicle2 {
    void start();
    void stop();
}

class Bike implements Vehicle2{

    @Override
    public void start() {
        System.out.println("骑自行车很有趣");
    }

    @Override
    public void stop() {
        System.out.println("不骑自行车了");
    }
}

class Bus implements Vehicle2{

    @Override
    public void start() {
        System.out.println("滴，公交卡");
    }

    @Override
    public void stop() {
        System.out.println("下一站是xxx，请下车的乘客做好准备");
    }
}