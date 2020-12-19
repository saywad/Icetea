package com.example.Icetea.service;

import com.example.Icetea.entry.UserInfo;
import com.example.Icetea.util.Response;

import java.util.List;

public interface IUserInfoService {

    /**
     * 查询用户信息列表
     *
     * @param page
     * @param pageSize
     * @return
     */
    Response queryUserInfoList(int page, int pageSize);

    /**
     * 根据id查询用户信息（批量）
     *
     * @param list
     * @return
     */
    Response queryUserInfoByUserId(List<String> list);

    /**
     * 批量新增用户信息
     *
     * @param list list
     */
    Response addUserInfo(List<UserInfo> list);

    /**
     * 修改用户信息
     *
     * @param userInfo userInfo
     */
    Response updateUserInfo(UserInfo userInfo);

    /**
     * 批量删除用户信息
     *
     * @param list list
     */
    Response deleteUserInfo(List<String> list);
}
