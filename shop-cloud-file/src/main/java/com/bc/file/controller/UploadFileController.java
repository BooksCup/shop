package com.bc.file.controller;

import com.bc.file.entity.UploadFile;
import com.bc.file.service.UploadFileService;
import com.bc.file.enums.ResponseMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 上传文件
 *
 * @author zhou
 */
@Api(description = "上传文件")
@RestController
@RequestMapping("uploadFile")
@CrossOrigin
public class UploadFileController {

    @Autowired
    UploadFileService uploadFileService;

    @ApiOperation(value = "新增上传文件", notes = "新增上传文件")
    @PostMapping(value = "")
    public ResponseEntity<String> addUploadFile(
            @RequestParam String storeId,
            @RequestParam String filePath) {
        ResponseEntity<String> responseEntity;
        try {
            UploadFile uploadFile = new UploadFile(storeId, filePath);
            uploadFileService.addUploadFile(uploadFile);
            responseEntity = new ResponseEntity<>(ResponseMsg.ADD_SUCCESS.getCode(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new ResponseEntity<>(ResponseMsg.ADD_ERROR.getCode(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

}