package com.mxdx2;

/**
 * 练习2
 *
 * @Author: wwb
 * @Date: 2020/4/15 17:48
 */
public class practice2 {
    public static void main(String[] args) {

    }
}
abstract class Vehicle{
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(this.name+" is Running");
    }
    abstract void wheelsNum();
}

class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    void wheelsNum(){
        System.out.println("这是个四轮车");
    }
}

class Motorbike extends Vehicle{
    public Motorbike(String name) {
        super(name);
    }

    void wheelsNum(){
        System.out.println("这是个两轮车");
    }
}
