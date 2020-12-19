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
     * 查询用户信息列表
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping(value = "queryUserInfoList")
    public Response queryUserInfoList(@RequestParam(name = "page") int page,
                                      @RequestParam(name = "pageSize") int pageSize){
        return userInfoService.queryUserInfoList(page, pageSize);
    }

    /**
     * 根据id查询用户信息（批量）
     *
     * @param ids
     * @return
     */
    @PostMapping(value = "queryUserInfoByUserId")
    public Response queryUserInfoByUserId(@RequestBody List<String> ids){
        return userInfoService.queryUserInfoByUserId(ids);
    }

    /**
     * 批量新增用户信息
     *
     * @param list list
     */
    @PostMapping(value = "addUserInfo")
    public Response addUserInfo(@RequestBody List<UserInfo> list){
        return userInfoService.addUserInfo(list);
    }

    /**
     * 修改用户信息
     *
     * @param userInfo userInfo
     */
    @PostMapping(value = "updateUserInfo")
    public Response updateUserInfo(@RequestBody UserInfo userInfo){
        return userInfoService.updateUserInfo(userInfo);
    }

    /**
     * 批量删除用户信息
     *
     * @param ids ids
     */
    @PostMapping(value = "deleteUserInfo")
    public Response deleteUserInfo(@RequestBody List<String> ids){
        return userInfoService.deleteUserInfo(ids);
    }
}
