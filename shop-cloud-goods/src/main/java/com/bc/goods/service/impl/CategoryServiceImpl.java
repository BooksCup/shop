package com.bc.goods.service.impl;

import com.bc.goods.cons.Constant;
import com.bc.goods.entity.Category;
import com.bc.goods.mapper.CategoryMapper;
import com.bc.goods.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.HashMap;
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
        Map<String, Object> paramMap = new HashMap<>(Constant.DEFAULT_HASH_MAP_CAPACITY);
        paramMap.put("storeId", category.getStoreId());
        paramMap.put("parentId", category.getParentId());
        List<Category> categoryList = categoryMapper.getCategoryListByStoreIdAndParentId(paramMap);
        Integer sort;
        if (CollectionUtils.isEmpty(categoryList)) {
            sort = 1;
        } else {
            sort = categoryList.size() + 1;
        }
        category.setSort(sort);
        categoryMapper.addCategory(category);
    }

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