package com.bc.goods.mapper;

import com.bc.goods.entity.Category;

import java.util.List;
import java.util.Map;

/**
 * 商品类别
 *
 * @author zhou
 */
public interface CategoryMapper {

    /**
     * 获取商品类别列表
     *
     * @param paramMap 参数map
     * @return 商品类别列表
     */
    List<Category> getCategoryList(Map<String, Object> paramMap);

}