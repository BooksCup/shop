package com.bc.store.mapper;

import com.bc.store.entity.StoreUser;

import java.util.List;
import java.util.Map;

/**
 * 企业用户
 *
 * @author zhou
 */
public interface StoreUserMapper {

    /**
     * 新增企业用户
     *
     * @param storeUser 企业用户
     */
    void addStoreUser(StoreUser storeUser);

    /**
     * 获取企业用户列表
     *
     * @param paramMap 参数map
     * @return 企业用户列表
     */
    List<StoreUser> getStoreUserList(Map<String, Object> paramMap);

    /**
     * 删除企业用户
     *
     * @param id 企业用户ID
     */
    void deleteStoreUser(String id);

}