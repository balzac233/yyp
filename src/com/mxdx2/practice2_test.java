package com.mxdx2;
import com.mxdx2.practice2;
/**
 * 练习2测试交通工具类
 *
 * @Author: wwb
 * @Date: 2020/4/15 18:19
 */
public class practice2_test {
    public static void main(String[] args) {
        Car car1=new Car("四轮车2号");
        Motorbike motor1=new Motorbike("摩托车7号");
        car1.run();
        car1.wheelsNum();
        motor1.run();
        motor1.wheelsNum();
    }
}