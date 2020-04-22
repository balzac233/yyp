package com.test;

/**
 * 百元买百鸡
 *
 * @Author: wwb
 * @Date: 2020/4/15 12:51
 */
public class buyChicken {
    public static void main(String[] args) {
//        java基础语法2-第13题
//        int[]  a=new int[500];
        int[]  sh=new int[100];
        int shIndex=0;
        int shSum;
        for (int i=1;i<1000;i++){
            shSum=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    shSum+=j;
                }
            }
            if(shSum==i){
//                System.out.println("新查找到一个实数"+shSum);
                sh[shIndex]=shSum;
                shIndex++;
            }
        }
        System.out.println("下列是【实数】列表：");
        for (int i=0;i<sh.length;i++){
            if (sh[i]==0) {//因为如何上面的循环i从零开始，那么0也是列表内的数字，不符合，所以直接break
                break;
            }
            System.out.print(sh[i]+", ");

        }

        System.out.println("\n=============换个行==============");

//        浮点型和整形
        int a=293;
        double b=18.02;
        System.out.println(a+b);
    }
}