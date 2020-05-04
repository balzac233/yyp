package com.example2.demo.service;

import com.example2.demo.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * dsfjf
 *
 *
 *
 * @Author: wwb
 * @Date: 2020/4/30 13:58
 */
@Service
public interface UserService {
    /**
     * 新增用户
     * @author wwb
     * @return int
     * @param userInfo
     * @date 2020-04-30
     */
    int insertUser(UserInfo userInfo);
    /**
     * 查询用户
     * @author wwb
     * @param userInfo
     * @return list<UserInfo>
     * @date 2020-04-30
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);
    /**
     * 多条件查询用户
     * @author wwb
     * @param userInfo
     * @return List<UserInfo>
     * @date 2020-04-30
     */
    List<UserInfo> listUserInfoByInfos(UserInfo userInfo);

    /**
     * 删除用户信息（假删）
     * @author wwb
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int deleteUser(UserInfo userInfo);

    /**
     * 删除用户信息（真删）
     * @author wwb
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int deleteUserReal(UserInfo userInfo);

    /**
     * 更新用户信息
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int updateUser(UserInfo userInfo);
}