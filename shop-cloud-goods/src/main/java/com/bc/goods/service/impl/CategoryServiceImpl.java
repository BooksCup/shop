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
     * 新增商品类别
     *
     * @param category 商品类别
     */
    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    /**
     * 修改商品类别
     *
     * @param category 商品类别
     */
    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    /**
     * 获取商品类别列表
     *
     * @param paramMap 参数map
     * @return 商品类别列表
     */
    @Override
    public List<Category> getCategoryList(Map<String, Object> paramMap) {
        List<Category> categoryList = categoryMapper.getCategoryListByStoreIdAndParentId(paramMap);
        for (Category category : categoryList) {
            paramMap.put("parentId", category.getId());
            List<Category> children = categoryMapper.getCategoryListByStoreIdAndParentId(paramMap);
            category.setChildren(children);
        }
        return categoryList;
    }

}