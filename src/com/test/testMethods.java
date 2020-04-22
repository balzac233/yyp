package com.test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试字符串和数组的方法
 *
 * @Author: wwb
 * @Date: 2020/4/19 10:48
 */
public class testMethods {
    public static void main(String[] args) {
//        String str1 = "hello";
//        String str2 = new String("hello");
//        System.out.println("str1和str2的地址对比：" + (str1 == str2));
//        System.out.println("str1和str2的值对比：" + str1.equals(str2));

//        Person p1 = new Person("xiaowang", 15);
//        Person p2 = new Person("xiaowang", 15);
//        System.out.println("p1和p2的地址对比：" + (p1 == p2));
//        System.out.println("p1和p2的值对比：" + p1.equals(p2));

////            double a=Math.random();
//        double a;
//        int n = 0;
//        while (n < 100) {
////            a = Math.ceil(Math.random() * 200);
//            a = Math.ceil(Math.random() * 35);
////            System.out.println(Math.random() * 200);
//            System.out.println(a);
//            n++;
//        }
//
//        String pattren = "^([0-9A-Za-z\-_\.]+)@([0-9a-z]+\.[a-z]{2,3}(\.[a-z]{2})?)$";


////        菜鸟教程的代码
//        // 按指定模式在字符串查找
//        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(\\D*)(\\d+)(.*)";
//
//        // 创建 Pattern 对象
//        Pattern r = Pattern.compile(pattern);
//
//        // 现在创建 matcher 对象
//        Matcher m = r.matcher(line);
//        if (m.find()) {
//            System.out.println("Found value: " + m.group(0));
//            System.out.println("Found value: " + m.group(1));
//            System.out.println("Found value: " + m.group(2));
//            System.out.println("Found value: " + m.group(3));
//        } else {
//            System.out.println("NO MATCH");
//        }

//        String pattren = "^([0-9A-Za-z\\-_\\.]+)@(([0-9a-z]+)\\.[a-z]{2,3}(\\.[a-z]{2})?)$";
//        StringBuffer sb1 = new StringBuffer("默认文字");
//        Pattern pt = Pattern.compile(pattren);
//        sb1.delete(0, sb1.length());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入宁的邮箱账号");
//        sb1.append(sc.next());
//        Matcher mc = pt.matcher(sb1);
//        if (mc.find()) {
//            System.out.println("邮箱格式正确");
//            System.out.println("确认宁的邮箱地址：" + mc.group(0));
//            if (mc.group(3) == "qq" || mc.group(3).equals("qq")) {
//                System.out.println("检测到是【qq邮箱】，宁的qq是：" + mc.group(1));
//            }
////            System.out.println("如果是qq邮箱，宁的qq是：" + mc.group(1));
//            System.out.println("宁的运营商是：" + mc.group(3));
//        } else {
//            System.out.println("邮箱格式错误");
//        }


//        String REGEX = "dog";
//        String INPUT = "The dog says meow. " +
//                "All dogs say meow." +
//                "the third dog";
//        String INPUT2 = "The dog says meow. " +
//                "All dogs say meow." +
//                "the third dog";
//        String INPUT3 = "The dog says meow. " +
//                "All dogs say meow." +
//                "the third dog" +
//                "AND MANY dog" +
//                "SO MUCH dog" +
//                "every dog in the world" +
//                "we need dog" +
//                "hey my little dog" +
//                "doge" +
//                "dogggggggg" +
//                "doggod";
//        String REPLACE = "cat";
//
//        Pattern p = Pattern.compile(REGEX);
////        // get a matcher object
////        Matcher m = p.matcher(INPUT);
////        INPUT = m.replaceAll(REPLACE);
////        Matcher m2 = p.matcher(INPUT2);
////        INPUT2 = m2.replaceFirst(REPLACE);
////        Matcher m3 = p.matcher(INPUT2);
////        INPUT2 = m3.replaceFirst(REPLACE);
////        System.out.println(INPUT);
////        System.out.println(INPUT2);
//
//
//        String input3 = MatcherNum(INPUT3, p, 4, REPLACE);
//        System.out.println("input3(BY INPUT3) is: " + input3);


//        int myarr[] = {1, 3, 5};
//        System.out.println(myarr.toString());

//        StringBuffer s1 = new StringBuffer("runoob");
//        s1.delete(1, 3);
//        System.out.println(s1);

//        int x = 4;
//        System.out.println(x++);

//        System.out.println(Math.round(3.7));

//        int a1 = 5;
//        double a2 = (float) a1;
//        System.out.println(a2);

//        int x = 3;
//        int y = 2;
//        if (x = y) {
//
//        }

//        char c = 65;
//        System.out.println(c);


//        int[] myarr = {1, 2, 3, 4, 5};
////        changeit.dolt(myarr);
//        dolt(myarr);
//        for (int i = 0; i < myarr.length; i++) {
//            System.out.println(myarr[i] + " ");
//        }


//        int[] arrr = new int[9];
//        System.out.println(arrr[9]);

//        String x = null;
//        System.out.println(x);

//        Integer i = new Integer(10);
//        Integer j = new Integer(20);
//        swap(i, j);
//        System.out.println(i + "   " + j);


//        char array[]={'a','b',';','c','g','j',';','p','t'};
//        String arr=

//        String a1 = new String("runoob");
//        String a2 = new String("runoob");
//        if (a1.hashCode() == a2.hashCode()) {
//            System.out.println("哈希值相等");
//        }
//        if (a1 == a2) {
//            System.out.println("内存地址一样");
//        }
//        if (a1.equals(a2)) {
//            System.out.println("值地址一样");
//        }

//        int i = 1;
//        int j;
//        j = i++ * 2 + 3 * --i;
//        System.out.println(i + "," + j);

//
//        String s = "rgdgdfg";
//        System.out.println("s=" + s.length());
//        char[] cc = {'2', '5', '7', 'f', 'y'};
//        System.out.println(cc.length);

//        int a[4]={1,2,3,4};

//        int total = 0;
////        for (int i = 0; i < 4; i++) {
////            if (i == 1) {
////                continue;
////            }
////            if (i == 2) {
////                break;
////            }
////            total = total + i;
////        }
////        System.out.println(total);

//        int x = 1;
//        int y = 10;
//        while (y-- > 0) {
//            x++;
//        }
//        System.out.println(x + " " + y);

//        int[] x = new int[25];
//        System.out.println(x[24] + "");


//        int x = 2;
//
//        switch (x) {
//            case 1:
//                System.out.println("out1");
//                break;
//            case 2:
//            case 3:
//                System.out.println("out2");
//                break;
//            default:
//                System.out.println("end");
//        }

//        Person p1 = new Person("34234", 23);
//        Person p2 = new Person("rjfjf", 56);
//        Person p3 = new Person("109eee", 19);
//        Person[] ps = new Person[]{p1, p2, p3};
////        ps = new Person[]{p1, p2, p3};
//        for (Person psItem : ps) {
//            psItem.printInfo();
//        }
//        p2 = p1;
//        swapP(p1, p2);
//        p2.printInfo();


//        String strArr = "a,b,c";
//        String[] split = strArr.split(",");
//        List<String> tempList = Arrays.asList(split);
//        System.out.println(tempList);
////        array ->Arrays
////        collection map ->Col lections
////        System.out.println(Collections.binarySearch(tempList, key = ""));
//        ArrayList<String> newList = new ArrayList<>(tempList.size());
////        ArrayList<String> newList = new ArrayList<>(3);
////        Collections.copy(newList, tempList);
////        Collections.copy(tempList, newList);
//        System.out.println(newList);

//        HashMap<String, String> hm1 = new HashMap<String, String>();
//        hm1.put("1", "3434");
//        hm1.put("2", "436");
//        hm1.put("3", "364354");
//        hm1.put("4", "6432");
//        HashMap<String, String> hm2 = new HashMap<String, String>();
//        hm2.put("11", "dfhgf");
//        hm2.put("22", "hdf");
//        hm2.put("33", "egdg");
//        hm2.put("44", "afdha");
//        HashMap<String, String> hm3 = new HashMap<String, String>();
//        hm3.put("111", "4h4g");
//        hm3.put("222", "6h2g7b");
//        hm3.put("333", "7if3f5");
//        hm3.put("444", "6g2rf4");
//        List<HashMap<String, String>> hml = new ArrayList<>();
//        hml.add(hm1);
//        hml.add(hm2);
//        hml.add(hm3);
//
//        for (HashMap<String, String> map : hml) {
//            for (HashMap.Entry<String, String> entry : map.entrySet()) {
//                System.out.print(entry.getKey() + "\t\t");
//                System.out.println(entry.getValue());
//            }
//        }


        //遍历含有HashMap数据的list
//        for (HashMap<String, String> map : hml) {
//            for (HashMap.Entry<String, String> m : map.entrySet()) {
//                System.out.print(m.getKey() + "\t\t");
//                System.out.println(m.getValue());
//            }
//        }

//        List<String> ls = new List<String>();
        //
//

//        SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
//        Date d1 = sd.parse("33345");

//        try {
////            int a = 4 / 0;
//            int[] a = new int[]{2, 5, 7, 254, 53};
//            System.out.println(a[15]);
//        } catch (Exception e) {
//            System.out.println("不能除0");
//            System.out.println(e.getMessage());
//        }

//        int[] myarr = {1, 2, 3, 4, 5};
//        ChangeIt.dolt(myarr);
//        for (int j = 0; j < myarr.length; j++) {
//            System.out.println(myarr[j] + " ");
//        }


//        int[] aa = new ArrayList() {1,0,9,2,9,1,6,5,9,3
//        };

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        int[] a2 = new int[]{1, 0, 9, 2, 9, 1, 6, 5, 9, 3};
        int[] a3 = new int[]{1, 4, 2, 0};
        for (int i = 0; i < a2.length; i++) {
            a1.add(a2[i]);
        }
        for (int i = 0; i < a3.length; i++) {
            a1.add(a3[i]);
        }
////        for (int i = 0; i < a1.size(); i++) {
//        System.out.print(a1 + " ");
////        }

        for (int i = 0; i < a1.size() - 1; i++) {
            System.out.print(a1.get(i) + "~");
        }
        System.out.println(a1.get(a1.size() - 1));

    }
//    *************************************************************
//    ****************************主函数结束************************
//    **************************************************************

    static void swapP(Person p1, Person p2) {
        Person temp = new Person("temp", 15);
        temp = p1;
        p1 = p2;
        p2 = temp;
    }


//    static int fun(int x=0){
//
//    }

    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }


    //    class changeit {
    static void dolt(int[] z) {
        int[] A = z;
        A[0] = 99;
    }
//    }


    //自定义一个限定次数的替换规则，第一个参数是整段文字，第二个是被替换内容的正则表达式，
// 第三个是替换前[num]个检测到的符合区域，用[replace]这个字符串把他们替换掉
    public static String MatcherNum(String input, Pattern pt, int num, String replace) {
        int n = 0;
        while (n < num) {
            Matcher m;
            m = pt.matcher(input);
            input = m.replaceFirst(replace);
            n++;
        }
        return input;
    }
}

//内部其他类
class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    public Person() {
//    }

    void printInfo() {
        System.out.println("名字是" + this.name + "年龄是" + this.age);
    }
}


class ChangeIt {
    static void dolt(int[] z) {
        z[3] = 333;
        z = null;
    }
}
