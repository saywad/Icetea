package com.example.Icetea.dao;

import com.example.Icetea.dto.UserInfoDto;
import com.example.Icetea.entry.UserInfo;
import com.example.Icetea.util.Response;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IUserInfoDao {

    /**
     * 查询用户信息列表
     *
     * @return
     */
    List<UserInfo> queryUserInfoList();

    /**
     * 根据id查询用户信息
     *
     * @param list
     * @return
     */
    List<UserInfo> queryUserInfoByUserId(List<String> list);

    /**
     * 批量新增用户信息
     *
     * @param list list
     */
    void addUserInfo(List<UserInfo> list);

    /**
     * 修改用户信息
     *
     * @param userInfo userInfo
     */
    void updateUserInfo(UserInfo userInfo);

    /**
     * 批量删除用户信息
     *
     * @param userInfoDto userInfoDto
     */
    void deleteUserInfo(UserInfoDto userInfoDto);
}
