package com.example.Icetea.service.impl;


import com.example.Icetea.dao.IUserInfoDao;
import com.example.Icetea.dto.UserInfoDto;
import com.example.Icetea.entry.UserInfo;
import com.example.Icetea.service.IUserInfoService;
import com.example.Icetea.util.Response;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public Response queryUserInfoList(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<UserInfo> list = userInfoDao.queryUserInfoList();
        PageInfo<List<UserInfo>> pageInfo = new PageInfo(list);
        return new Response(true, pageInfo);
    }

    @Override
    public Response queryUserInfoByUserId(List<String> list) {
        List<UserInfo> userInfoList = userInfoDao.queryUserInfoByUserId(list);
        return new Response(true, userInfoList);
    }

    @Override
    public Response addUserInfo(List<UserInfo> list) {
        if(CollectionUtils.isEmpty(list)){
            return new Response(false, "参数为空");
        }
        for(UserInfo userInfo : list){
            userInfo.setId(UUID.randomUUID().toString().replace("-", ""));
            userInfo.setIsDelete("N");
            userInfo.setCreateTime(new Date());
            userInfo.setLastModifyTime(new Date());
        }
        userInfoDao.addUserInfo(list);
        return new Response(true);
    }

    @Override
    public Response updateUserInfo(UserInfo userInfo) {
        userInfo.setLastModifyTime(new Date());
        userInfoDao.updateUserInfo(userInfo);
        return new Response(true);
    }

    @Override
    public Response deleteUserInfo(List<String> list) {
        if(CollectionUtils.isEmpty(list)){
            return new Response(false, "参数为空");
        }
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setDeleteIds(list);
        userInfoDto.setLastModifyTime(new Date());
        userInfoDao.deleteUserInfo(userInfoDto);
        return new Response(true);
    }
}
