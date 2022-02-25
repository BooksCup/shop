package com.bc.store.service;

import com.bc.store.entity.StoreUser;

/**
 * 企业管理员
 *
 * @author zhou
 */
public interface StoreUserService {

    /**
     * 新增企业管理员
     *
     * @param storeUser 企业管理员
     */
    void addStoreUser(StoreUser storeUser);

}