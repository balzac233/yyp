package com.test;

import java.text.ParseException;
import java.util.ArrayList;


/**
 * 字符串类型数据操作
 *
 * @Author: wwb
 * @Date: 2020/4/16 13:47
 */
public class testString {
    public static void main(String[] args) throws ParseException {
//        System.out.println("println函数：杠n换行\n百分号n换行%n后面的内容");
//        System.out.printf("printf函数：杠n换行\n百分号n换行%n后面的内容");
//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1, "one");
//        map.put(1, "two");
//        System.out.println(map);

////        String a = "123aaa";
////        int int1 = Integer.parseInt(a);
//        int int1 = 1;
//        String b = "123.12";
//        int int2 = Integer.parseInt(b);
//        System.out.println(int1 + "  " + int2);

//        Date nowdate = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
////        String datestr = sdf.parse(nowdate, );
//        String datestr = sdf.format(nowdate);
////        System.out.println(nowdate);
//        System.out.println(datestr);
//        Date date1 = sdf.parse(" 2008-07-10 19:20:00 ");
//        Date date2 = sdf.parse(" 2012-08-06 21:10:00 ");
//        System.out.println(date1 + " " + date2);
//        boolean b = date1.after(date2);
//        System.out.println(b);
////        System.out.println();


//        try {
//            Date date1 = sdf.parse(" 2008-07-10 19:20:00 ");
//            Date date2 = sdf.parse(" 2012-08-06 21:10:00 ");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        System.out.println(date1>date2);


//        for (int i = 0; i < 6; i++) {
//            int a = (int) (1 + Math.ceil((Math.random() * 33)));
//            for (int j=0;j<int1.size();j++) {
//                if (int1.indexOf(j)==a){
//                    continue;
//                }
//                int1.add(a);
//            }
//        }


//        int1.add(2);
//        int1.add(3);
//        int1.add(7);
//        int1.add(0);
////        System.out.println(int1.get(2));
//        System.out.println(int1);


//        Set<Integer> int1 = new HashSet<>();
//        int i = 0;
//        int flag = 0;
//        while (i < 7) {
//            int a = (int) (1 + Math.ceil((Math.random() * 33)));
//            for (int j = 0; j < int1.size(); j++) {
//                if (int1.indexOf(j) == a) {
//                    break;
//                }
//            }
//            i++;
//            int1.add(a);
//        }
//        for (int k = 0; k < int1.size(); k++) {
//            System.out.print(int1.indexOf(k));
//        }


//        ArrayList<Integer> int1 = new ArrayList<>();
//        int i = 0;
//        int flag = 0;
//        while (i < 7) {
//            flag = 0;
//            int a = (int) (1 + Math.ceil((Math.random() * 33)));
//            for (int j = 0; j < int1.size(); j++) {
//                if (int1.indexOf(j) == a) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 1) {
//                break;
//            }
//            i++;
//            int1.add(a);
//        }
//        for (int k = 0; k < int1.size(); k++) {
//            System.out.print(int1.indexOf(k));
//        }

//第一题
//        ArrayList<Integer> int1 = new ArrayList<>();
//        int i = 0;
//        while (i < 6) {
////            int a = (int) (1 + Math.ceil((Math.random() * 33)));
//            int a = new Random().nextInt(33) + 1;
//            if (int1.contains(a)) {
//                continue;
//            }
//            i++;
//            int1.add(a);
//        }
////        int b = (int) (1 + Math.ceil((Math.random() * 33)));
//        Collections.sort(int1);
//        int b = new Random().nextInt(33) + 1;
//        String int1str = listToString(int1, ',');
////        System.out.println(int1.size());
//        if (int1.size() != 1) {
////            System.out.print(int1.get(0));
////            for (int k = 1; k < int1.size(); k++) {
////                System.out.print("," + int1.get(k));
////            }
////            System.out.println();
//            System.out.println(int1str);
//        } else {
//            System.out.println("红球还没抽呢");
//        }
        System.out.println("Helloworld!!");

    }

    public static String listToString(ArrayList list, char separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i));
                sb.append(separator);
            }
        }
        return sb.toString();
    }
}