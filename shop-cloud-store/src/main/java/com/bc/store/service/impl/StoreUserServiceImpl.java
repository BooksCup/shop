package com.bc.store.service.impl;

import com.bc.store.entity.StoreUser;
import com.bc.store.mapper.StoreUserMapper;
import com.bc.store.service.StoreUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    /**
     * 获取企业用户列表
     *
     * @param paramMap 参数map
     * @return 企业用户列表
     */
    @Override
    public List<StoreUser> getStoreUserList(Map<String, Object> paramMap) {
        return storeUserMapper.getStoreUserList(paramMap);
    }

    /**
     * 删除企业用户
     *
     * @param id 企业用户ID
     */
    @Override
    public void deleteStoreUser(String id) {
        storeUserMapper.deleteStoreUser(id);
    }

}