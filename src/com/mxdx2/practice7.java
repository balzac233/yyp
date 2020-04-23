package com.mxdx2;

/**
 * 练习7
 *
 * @Author: wwb
 * @Date: 2020/4/15 22:53
 */
public class practice7 {
    public static void main(String[] args) {
        System.out.println("第七题");
    }
}
class Car2{
    String id;
    String brand;
    String color;
    double price;
    String rank;
    double cost;

    public Car2(String id, String brand, String color, double price, String rank) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.rank = rank;
    }

//    void calCost(String rank){
        double calCost(){
        String rank=this.rank;
        switch (rank){
            case "A":
                this.cost=this.price+(this.price/1.17*0.05)+500+420+950;
                break;
            case "B":
                this.cost=this.price+(this.price/1.17*0.075)+500+480+1000;
                break;
            case "C":
                this.cost=this.price+(this.price/1.17*0.1)+500+580+1100;
                break;
            default:
                System.out.println("车的等级不正确");
        }
        return this.cost;
    }
}
//class