package com.bc.goods.controller;

import com.bc.goods.cons.Constant;
import com.bc.goods.entity.Category;
import com.bc.goods.service.CategoryService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品类别
 *
 * @author zhou
 */
@Api(description = "商品类别")
@RestController
@RequestMapping("category")
@CrossOrigin
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @ApiOperation(value = "获取店铺下商品类别列表", notes = "获取店铺下商品类别列表")
    @GetMapping(value = "")
    public ResponseEntity<List<Category>> getCategoryList(@RequestParam String storeId) {
        ResponseEntity<List<Category>> responseEntity;
        try {
            Map<String, Object> paramMap = new HashMap<>(Constant.DEFAULT_HASH_MAP_CAPACITY);
            paramMap.put("storeId", storeId);
            List<Category> categoryList = categoryService.getCategoryList(paramMap);
            responseEntity = new ResponseEntity<>(categoryList, HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

}