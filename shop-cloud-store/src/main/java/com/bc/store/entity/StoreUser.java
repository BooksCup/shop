package com.bc.store.entity;

import com.bc.common.utils.CommonUtil;

/**
 * 店铺管理员
 *
 * @author zhou
 */
public class StoreUser {

    private String id;
    private String storeId;
    private String userName;
    private String realName;
    private String password;
    private Integer sort;

    public StoreUser() {

    }

    public StoreUser(String storeId, String userName, String realName, String password, Integer sort) {
        this.id = CommonUtil.generateId();
        this.storeId = storeId;
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.sort = sort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}