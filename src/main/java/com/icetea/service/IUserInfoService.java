package com.icetea.service;

import com.icetea.entry.UserInfo;

import java.util.List;

public interface UserInfoService {

    /**
     * 新增用户信息
     *
     * @param list list
     */
    void addUserInfo(List<UserInfo> list);
}
