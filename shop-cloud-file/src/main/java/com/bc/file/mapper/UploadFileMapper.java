package com.bc.file.mapper;

import com.bc.file.entity.UploadFile;

/**
 * 上传文件
 *
 * @author zhou
 */
public interface UploadFileMapper {

    /**
     * 新增上传文件
     *
     * @param uploadFile 上传文件
     */
    void addUploadFile(UploadFile uploadFile);

}