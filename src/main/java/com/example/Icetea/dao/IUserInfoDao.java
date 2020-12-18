package com.example.Icetea.dao;

import com.example.Icetea.entry.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IUserInfoDao {

    /**
     * 新增用户信息
     *
     * @param list list
     */
    void addUserInfo(List<UserInfo> list);
}
