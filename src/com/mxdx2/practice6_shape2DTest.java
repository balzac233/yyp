package com.mxdx2;
import com.mxdx2.practice6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 第六题测试类
 *
 * @Author: wwb
 * @Date: 2020/4/15 22:48
 */
public class practice6_shape2DTest {
    public static void main(String[] args) {
        Circle c1=new Circle(3);
        Rectangle r1=new Rectangle(6, 4);
//        System.out.println(c1.type+"c1的周长为"+c1.grith()+"面积为"+c1.area());
//        System.out.println(r1.type+"c1的周长为"+r1.grith()+"面积为"+r1.area());
//        calcircle(c1);
        calRect(r1);
        Circle.print();//通过类名直接调用静态方法
//        c1.print();//通过对象调用静态方法
//        可以运行，但是编译器不会自动弹出print这个静态方法的候选项而是弹出print2这个非静态方法。
//        System.out.println("=============c1c1c1==================");
//        System.out.println(c1);//com.mxdx2.Circle@4554617c
//        System.out.println(c1.toString());//com.mxdx2.Circle@4554617c

//        int[] arrTmp=new int[]{1,8,666,4,5,33,1,8,89};
////        System.out.println(arrTmp.toString());
//            System.out.println(Arrays.toString(arrTmp));
////            int[] arr2=Arrays.sort;
////        int[] arr2=Arrays.parallelSort(arrTmp);
////        System.out.println(Arrays.parallelSort(arrTmp));
////        System.out.println(Arrays.parallelSort(arrTmp));
////        System.out.println(Arrays.parallelSort(arrTmp));
//        Arrays.sort(arrTmp);
//        System.out.println(Arrays.toString(arrTmp));
//        c1.aa11="10929165";

    }

    public void calCircle(Circle c){
        Circle.print();
        System.out.println("用方法来算圆形周长与面积");
        System.out.println(c.type+"c1的周长为"+c.grith()+"面积为"+c.area());
    }
    public static void calRect(Rectangle d){
        System.out.println("用静态方法来算矩形周长与面积等");
        System.out.println(d.type+"c1的周长为"+d.grith()+"面积为"+d.area());
//        Circle c=new Circle(4);
//        calCircle(c);
    }
}