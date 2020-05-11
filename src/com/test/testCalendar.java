package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: wwb
 * @Date: 2020/5/11 16:00
 */
public class testCalendar {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s1;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期：(格式yyyy-MM-dd)");
        s1 = sc.nextLine();
        date = sdf.parse(s1);
        System.out.println("请输入几年前：");
        i = sc.nextInt();
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        Date date2 = new Date();
        cld.add(Calendar.YEAR, -1 * i);
        String s2 = getWeek(cld.get(Calendar.DAY_OF_WEEK));
        System.out.println(i + " 年前的这天为星期 " + s2);
    }

    public static String getWeek(int i) {
        String w;
        switch (i) {
            case 1:
                w = "日";
                break;
            case 2:
                w = "一";
                break;
            case 3:
                w = "二";
                break;
            case 4:
                w = "三";
                break;
            case 5:
                w = "四";
                break;
            case 6:
                w = "五";
                break;
            case 7:
                w = "六";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
        return w;
    }

    public static String beforeI() {
        return "none";
    }
}


//    Date date = new Date();
//    //        System.out.println(date);
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    String s1;
//    int i;
//    Scanner sc = new Scanner(System.in);
//        System.out.println("请输入日期：");
//                s1 = sc.nextLine();
//                date = sdf.parse(s1);
//                System.out.println("请输入几年前：");
//                i = sc.nextInt();
////        System.out.println(" s1= " + s1 + " , i= " + i);
//                Calendar cld = Calendar.getInstance();
//                cld.setTime(date);
//                Date date2 = new Date();
////        date2 = sdf.format(date);
////        System.out.println(i + " 年前的这天为星期 " + cld.get(Calendar.DAY_OF_WEEK));
//                cld.add(Calendar.YEAR, -1 * i);
////        System.out.println(" date= " + date);
////        System.out.println(" cld= " + cld);
//                String s2 = getWeek(cld.get(Calendar.DAY_OF_WEEK));
//                System.out.println(i + " 年前的这天为星期 " + s2);
////        System.out.println(i + " 年前的这天为星期 " + cld.get(Calendar.DAY_OF_WEEK));
