package com.mxdx2;

import com.mxdx2.practice7;

import java.text.DecimalFormat;

/**
 * 练习7测试类
 *
 * @Author: wwb
 * @Date: 2020/4/15 23:14
 */
public class practice7_test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.000 RMB");
        Car2[] carList = new Car2[1000];
        Car2 c1 = new Car2("566", "n33ii", "red", 233333, "A");
        Car2 c2 = new Car2("56", "ni22i", "red", 230000, "B");
        Car2 c3 = new Car2("5746", "nbi88", "red", 560000, "B");
        Car2 c4 = new Car2("5311", "nii55", "red", 1230000, "C");
        //        System.out.println("id为"+c1.id+"的"+c1.brand+"牌"+c1.rank+"级车购买整车(包括各种费用)的价格为"+df.format(c1.calCost()));
//        System.out.println("id为"+c2.id+"的"+c2.brand+"牌"+c2.rank+"级车购买整车(包括各种费用)的价格为"+df.format(c2.calCost()));
//        System.out.println("id为"+c3.id+"的"+c3.brand+"牌"+c3.rank+"级车购买整车(包括各种费用)的价格为"+df.format(c3.calCost()));
//        System.out.println("id为"+c4.id+"的"+c4.brand+"牌"+c4.rank+"级车购买整车(包括各种费用)的价格为"+df.format(c4.calCost()));
        carList = new Car2[]{c1, c2, c3, c4};
        for (Car2 car : carList) {
            System.out.println("id为" + car.id + "的" + car.brand + "牌【" + car.rank + "】级车购买整车(包括各种费用)的价格为" + df.format(car.calCost()));
        }
    }
}