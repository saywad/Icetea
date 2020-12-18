package com.example.Icetea.service.impl;


import com.example.Icetea.dao.IUserInfoDao;
import com.example.Icetea.entry.UserInfo;
import com.example.Icetea.service.IUserInfoService;
import com.example.Icetea.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public Response addUserInfo(List<UserInfo> list) {
        userInfoDao.addUserInfo(list);
        return new Response();
    }
}
