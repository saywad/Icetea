package com.example.Icetea.controller;

import com.example.Icetea.entry.UserInfo;
import com.example.Icetea.service.IUserInfoService;
import com.example.Icetea.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    /**
     * 新增用户信息
     *
     * @param list list
     */
    @PostMapping(value = "addUserInfo")
    public Response addUserInfo(@RequestBody List<UserInfo> list){
        return userInfoService.addUserInfo(list);
    }

    /**
     * 新增用户信息
     *
     * @param id id
     */
    @PostMapping(value = "test")
    public Response test(@RequestParam(name = "id") String id){
        return new Response(id);
    }
}
