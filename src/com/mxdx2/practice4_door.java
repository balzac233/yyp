package com.mxdx2;
import com.mxdx2.practice4;
/**
 * 开门查水表
 *
 * @Author: wwb
 * @Date: 2020/4/15 21:17
 */
public class practice4_door {
    public static void main(String[] args) {
        FireProofDoor fd1=new FireProofDoor();
        BulletProofDoor bd1=new BulletProofDoor();
        fd1.open();
        fd1.close();
        fd1.fireProof();
        bd1.open();
        bd1.close();
        bd1.bulletProof();
    }
}