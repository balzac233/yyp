package com.mxdx2;
import com.mxdx2.practice1;

/**
 * 测试软件老师
 *
 * @Author: wwb
 * @Date: 2020/4/15 16:39
 */
public class practice1_softwareTeacher {
    public static void main(String[] args) {
        softwareTeacher st1=new softwareTeacher("3543", "Mr soft", "male", 34, "doctor","normalTeacher" );
        st1.teachProcedure();
        st1.teach("后端");
        st1.startWork(9);
        st1.offWork(23);
    }
}