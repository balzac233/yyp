package com.mxdx2;

/**
 * 练习1
 *
 * @Author: wwb
 * @Date: 2020/4/15 15:42
 */
public class practice1 {
    public static void main(String[] args) {
        MusicTeacher mt1 = new MusicTeacher("23", "大家music", "男", 18, "硕士", "2班班主任");
        mt1.teachProcedure();
//        nininiisninfi
    }
}

//教师大类
abstract class Teacher {
    String id;//教师编号
    String name;//姓名
    String sex;//性别
    int age;//年龄
    String education;//学历
    String teacherTitle;//职称

//git 屁屁屁屁屁

    public Teacher(String id, String name, String sex, int age, String education, String teacherTitle) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.teacherTitle = teacherTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle;
    }

    public void startWork(int time) {
        System.out.println(this.name + " " + time + " 上班");
    }

    public void offWork(int time) {
        System.out.println(this.name + " " + time + " 下班");
    }

    public void teach(String course) {
        System.out.println(this.name + " 教 " + course);
    }

    abstract public void teachProcedure();
}

//音乐老师
class MusicTeacher extends Teacher {

    public MusicTeacher(String id, String name, String sex, int age, String education, String teacherTitle) {
        super(id, name, sex, age, education, teacherTitle);
    }

    @Override
    public void teachProcedure() {
        System.out.println("我是 " + this.name + " 我是教你唱歌的");
    }


}

//软件老师
class softwareTeacher extends Teacher {

    public softwareTeacher(String id, String name, String sex, int age, String education, String teacherTitle) {
        super(id, name, sex, age, education, teacherTitle);
    }

    @Override
    public void teachProcedure() {
        System.out.println("我是 " + this.name + " 我是教你敲代码的");
    }
}