package com.example.Icetea.dto;

import com.example.Icetea.entry.UserInfo;

import java.util.List;

public class UserInfoDto extends UserInfo {

    /**
     * 要删除的id集合
     */
    private List<String> deleteIds;

    public List<String> getDeleteIds() {
        return deleteIds;
    }

    public void setDeleteIds(List<String> deleteIds) {
        this.deleteIds = deleteIds;
    }
}
