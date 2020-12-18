package com.example.Icetea.service;

import com.example.Icetea.entry.UserInfo;
import com.example.Icetea.util.Response;

import java.util.List;

public interface IUserInfoService {

    /**
     * 新增用户信息
     *
     * @param list list
     */
    Response addUserInfo(List<UserInfo> list);
}
