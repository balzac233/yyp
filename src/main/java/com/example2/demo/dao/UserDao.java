package com.example2.demo.dao;

import com.example2.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * suhdfsf
 * 数据访问层
 * @Author: wwb
 * @Date: 2020/4/30 12:39
 */
@Repository
@Mapper
public interface UserDao {

    /**
     * 新增用户
     * @author wwb
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */

    int saveUser(UserInfo userInfo);

    /**
     * 查询用户
     * @author wwb
     * @param userInfo
     * @return List<UserInfo>
     * @date 2020-04-30
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);

/**
 *
 * @author wwb
 
 
 * @date 
 */

    /**
     * 更新用户信息
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int updateUser(UserInfo userInfo);

    /**
     * 删除用户信息（假删）
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int deleteUser(UserInfo userInfo);

    /**
     * 删除用户信息（真删）
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int deleteUserReal(UserInfo userInfo);


    /**
     * 多条件查询用户
     * @author wwb
     * @param userInfo
     * @return List<UserInfo>
     * @date 2020-04-30
     */
    List<UserInfo> listUserInfoByInfos(UserInfo userInfo);

}