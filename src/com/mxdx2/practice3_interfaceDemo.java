package com.mxdx2;
import com.mxdx2.practice3;
/**
 * 测试调用交通工具接口生成的类
 *
 * @Author: wwb
 * @Date: 2020/4/15 18:53
 */
public class practice3_interfaceDemo {
    public static void main(String[] args) {
        Bike bike1=new Bike();
        Bus bus1=new Bus();
        bike1.start();
        bike1.stop();
        bus1.start();
        bus1.stop();
    }
}