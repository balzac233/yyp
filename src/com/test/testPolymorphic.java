package com.test;

/**
 * 测试多态
 *
 * @Author: wwb
 * @Date: 2020/4/15 12:01
 */
public class testPolymorphic {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
        Cat c=(Cat)a;
        c.walk();
    }
}
class Animal{
    String name="一种动物";
    public void eat(){
        System.out.println(this.name+"正在吃东西");
    }
    public void walk(){
        System.out.println(this.name+"正在走路");
    }
}
class Cat extends Animal{
    String name="无牙";
    int age;
    public void eat(){
        System.out.println(this.name+"正在吃小鱼干");
    }
    public void walk(){
        System.out.println(this.name+"正在跳柜子");
    }
}

class Dog extends Animal{
    String name="阿柴";
    int age;
    boolean isBack;
    public void eat(){
        System.out.println(this.name+"正在啃骨头");
    }
    public void walk(){
        System.out.println(this.name+"正在草地跑步");
    }
}