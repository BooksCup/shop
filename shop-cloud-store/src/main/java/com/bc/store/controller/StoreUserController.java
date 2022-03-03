package com.bc.store.controller;

import com.bc.common.cons.Constant;
import com.bc.common.enums.ResponseMsg;
import com.bc.store.entity.StoreUser;
import com.bc.store.service.StoreUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业管理员
 *
 * @author zhou
 */
@Api(description = "企业管理员")
@RestController
@RequestMapping("storeUser")
@CrossOrigin
public class StoreUserController {

    @Autowired
    StoreUserService storeUserService;

    @ApiOperation(value = "新增企业管理员", notes = "新增企业管理员")
    @PostMapping(value = "")
    public ResponseEntity<String> addStoreUser(
            @RequestParam String storeId,
            @RequestParam String userName,
            @RequestParam String realName,
            @RequestParam String password,
            @RequestParam Integer sort) {
        ResponseEntity<String> responseEntity;
        try {
            StoreUser storeUser = new StoreUser(storeId, userName, realName, password, sort);
            storeUserService.addStoreUser(storeUser);
            responseEntity = new ResponseEntity<>(ResponseMsg.ADD_SUCCESS.getCode(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new ResponseEntity<>(ResponseMsg.ADD_ERROR.getCode(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @ApiOperation(value = "获取企业用户列表", notes = "获取企业用户列表")
    @GetMapping(value = "")
    public ResponseEntity<List<StoreUser>> getStoreUserList(@RequestParam String storeId) {
        ResponseEntity<List<StoreUser>> responseEntity;
        try {
            Map<String, Object> paramMap = new HashMap<>(Constant.DEFAULT_HASH_MAP_CAPACITY);
            paramMap.put("storeId", storeId);
            List<StoreUser> storeUserList = storeUserService.getStoreUserList(paramMap);
            responseEntity = new ResponseEntity<>(storeUserList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @ApiOperation(value = "获取企业用户列表", notes = "获取企业用户列表")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteStoreUser(@PathVariable String id) {
        ResponseEntity<String> responseEntity;
        try {
            storeUserService.deleteStoreUser(id);
            responseEntity = new ResponseEntity<>(ResponseMsg.DELETE_SUCCESS.getCode(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new ResponseEntity<>(ResponseMsg.DELETE_ERROR.getCode(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

}