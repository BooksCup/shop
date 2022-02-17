package com.bc.file.service.impl;

import com.bc.file.entity.UploadFile;
import com.bc.file.mapper.UploadFileMapper;
import com.bc.file.service.UploadFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 上传文件
 *
 * @author zhou
 */
@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Resource
    UploadFileMapper uploadFileMapper;

    /**
     * 新增上传文件
     *
     * @param uploadFile 上传文件
     */
    @Override
    public void addUploadFile(UploadFile uploadFile) {
        uploadFileMapper.addUploadFile(uploadFile);
    }

}