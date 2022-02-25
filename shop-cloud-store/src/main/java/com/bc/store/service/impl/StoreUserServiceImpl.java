package com.bc.store.service.impl;

import com.bc.store.entity.StoreUser;
import com.bc.store.mapper.StoreUserMapper;
import com.bc.store.service.StoreUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 企业管理员
 *
 * @author zhou
 */
@Service
public class StoreUserServiceImpl implements StoreUserService {

    @Resource
    StoreUserMapper storeUserMapper;

    /**
     * 新增企业管理员
     *
     * @param storeUser 企业管理员
     */
    @Override
    public void addStoreUser(StoreUser storeUser) {
        storeUserMapper.addStoreUser(storeUser);
    }

}