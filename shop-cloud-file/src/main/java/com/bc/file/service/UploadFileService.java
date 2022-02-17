package com.bc.file.service;

import com.bc.file.entity.UploadFile;

/**
 * 上传文件
 *
 * @author zhou
 */
public interface UploadFileService {

    /**
     * 新增上传文件
     *
     * @param uploadFile 上传文件
     */
    void addUploadFile(UploadFile uploadFile);

}
