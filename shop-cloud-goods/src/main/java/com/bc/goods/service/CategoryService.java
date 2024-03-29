package com.bc.goods.service;

import com.bc.goods.entity.Category;

import java.util.List;
import java.util.Map;

/**
 * 商品类别
 *
 * @author zhou
 */
public interface CategoryService {

    /**
     * 新增商品类别
     *
     * @param category 商品类别
     */
    void addCategory(Category category);

    /**
     * 修改商品类别
     *
     * @param category 商品类别
     */
    void updateCategory(Category category);

    /**
     * 获取商品类别列表
     *
     * @param paramMap 参数map
     * @return 商品类别列表
     */
    List<Category> getCategoryList(Map<String, Object> paramMap);

}
