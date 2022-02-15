package com.bc.goods.service.impl;

import com.bc.goods.entity.Category;
import com.bc.goods.mapper.CategoryMapper;
import com.bc.goods.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 商品类别
 *
 * @author zhou
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    CategoryMapper categoryMapper;

    /**
     * 获取商品类别列表
     *
     * @param paramMap 参数map
     * @return 商品类别列表
     */
    @Override
    public List<Category> getCategoryList(Map<String, Object> paramMap) {
        return categoryMapper.getCategoryList(paramMap);
    }

}