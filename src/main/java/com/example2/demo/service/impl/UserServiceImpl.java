package com.example2.demo.service.impl;

import com.example2.demo.dao.UserDao;
import com.example2.demo.entity.UserInfo;
import com.example2.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.hibernate.validator.constraints.NotEmpty;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * dakljafd
 * 实现具体的业务操作
 * @Author: wwb
 * @Date: 2020/4/30 13:58
 */
@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
//        写业务逻辑
        String userName=userInfo.getUserName();
        if (null != userName  &&  !"".equals(userName)){
            userName=userName +"aaa";
            userInfo.setUserName(userName);
        }else {
            System.out.println("必须要输入姓名");
            return 0;
        }
        return userDao.saveUser(userInfo);
    }

    @Override
    public List<UserInfo> listUserInfo(UserInfo userInfo){
        List eptls = null;
//        @Param("userInfo")
//        SqlSession session=
        List<UserInfo> userInfos=userDao.listUserInfo(userInfo);
//        List<UserInfo>=
        String userName=userInfo.getUserName();
        if (null != userName  &&  !"".equals(userName)){

        }else {
            System.out.println("必须要输入姓名");
//            return 0;
            return eptls;
        }
        return userInfos;
    }

    @Override
    public List<UserInfo>  listUserInfoByInfos(UserInfo userInfo){
        List eptls = null;
//        @Param("userInfo")
//        SqlSession session=
        List<UserInfo> userInfos=userDao.listUserInfoByInfos(userInfo);
//        List<UserInfo>=
        String userName=userInfo.getUserName();
        String sex=userInfo.getSex();
        if (null != userName  &&  !"".equals(userName)){
            System.out.println("名称正确");
        }else {
            System.out.println("必须要输入姓名");
//            return 0;
            return eptls;
        }
        System.out.println("查询成功2");
        return userInfos;
    }

    @Override
    public int deleteUser(UserInfo userInfo) {
        String userName=userInfo.getUserName();
        if (null != userName  &&  !"".equals(userName)){
            System.out.println("姓名已输入");
        }else {
            System.out.println("必须要输入姓名");
            return 0;
        }
        return userDao.deleteUser(userInfo);
    }

    @Override
    public int deleteUserReal(UserInfo userInfo) {
        String userName=userInfo.getUserName();
        if (null != userName  &&  !"".equals(userName)){
            System.out.println("姓名已输入");
        }else {
            System.out.println("必须要输入姓名");
            return 0;
        }
        return userDao.deleteUserReal(userInfo);
    }

    /**
     * 更新用户信息
     * 根据性别，账号，身份证
     * 可更改用户名，账号，邮箱
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    @Override
    public int updateUser(UserInfo userInfo) {
        int update=userDao.updateUser(userInfo);
        if (update==0) {
            return 0;
        }
        else {
            return update;
        }
    }

//    @Override
//    int deleteUser(UserInfo userInfo){
//
//    }

}