package com.bc.goods.entity;

import com.bc.common.utils.CommonUtil;

import java.util.List;

/**
 * 商品类别
 *
 * @author zhou
 */
public class Category {

    private String id;
    private String storeId;
    private String name;
    private String parentId;
    private String imageId;
    private String imageUrl;
    private String status;
    private Integer sort;
    private String createTime;
    private List<Category> children;

    public Category() {

    }

    public Category(String storeId, String name, String parentId,
                    String imageId, String status, Integer sort) {
        this.id = CommonUtil.generateId();
        this.storeId = storeId;
        this.name = name;
        this.parentId = parentId;
        this.imageId = imageId;
        this.status = status;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

}