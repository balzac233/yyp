package com.mxdx2;

/**
 * 练习6
 *
 * @Author: wwb
 * @Date: 2020/4/15 22:30
 */
public class practice6 {
    public static void main(String[] args) {
        System.out.println("第六题");
    }
}
interface shape2D{
    double grith();
    double area();
}
class Circle implements shape2D{
    final String aa11 = null;
//    setAA11(String aa1){
//        this.aa11=aa1;
//    }

    void getAA11(){
        System.out.println("输出静态变量aa11"+this.aa11);
    }

    final String type="圆形";
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public static void print(){
        System.out.println("这是圆形类里头的静态方法");
//        this.print2();//不能调用，因为静态方法不能调用非静态方法
        Circle c=new Circle(2);
        c.print2();
    }

    public void print2(){
        System.out.println("这是圆形类里头的非静态方法print2");
    }

    @Override
    public double grith() {
        return this.r*3.14*2;
    }

    @Override
    public double area() {
//        return this.r*this.r*3.14;
        return (Math.pow(this.r, 2))*3.14;
    }
}

class Rectangle implements shape2D{
    final String type="矩形";
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double grith() {
        return (this.width+this.height)*2.0;
    }

    @Override
    public double area() {
        return this.width*this.height;
    }
}



