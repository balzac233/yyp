package com.example2.demo.controller;

import com.example2.demo.dao.UserDao;
import com.example2.demo.entity.UserInfo;
import com.example2.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * hjhdf
 *
 * @Author: wwb
 * @Date: 2020/5/1 10:34
 */
//@Controller
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo) {
//        对参数进行一些简单的处理
        userInfo.setCreateBy("YypAaA");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/selectByName")
    public List<UserInfo> listUserInfo(UserInfo userInfo){
        List<UserInfo> userInfos=userService.listUserInfo(userInfo);
        return userInfos;
    }

    @RequestMapping("/selectByInfos")
    public List<UserInfo> listUserInfoByInfos(UserInfo userInfo){
        List<UserInfo> userInfos=userService.listUserInfoByInfos(userInfo);
        System.out.println("这里是controller层");
        return userInfos;
    }

    @RequestMapping("/deletetUser")
    public int deleteUser(UserInfo userInfo) {
        return userService.deleteUser(userInfo);
    }

//            System.out.println("controller层的假删");

    @RequestMapping("/deletetUserReal")
    public int deletetUserReal(UserInfo userInfo) {
        System.out.println("controller层的假删");
        return userService.deleteUserReal(userInfo);
    }


    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }

//    public int
}