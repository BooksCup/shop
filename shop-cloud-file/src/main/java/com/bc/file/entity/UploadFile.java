package com.bc.file.entity;

import com.bc.file.utils.CommonUtil;

/**
 * 上传文件
 *
 * @author zhou
 */
public class UploadFile {

    private String fileId;
    private String storeId;
    private String groupId;
    private String channel;
    private String fileName;
    private String filePath;

    public UploadFile() {

    }

    public UploadFile(String storeId, String filePath) {
        this.fileId = CommonUtil.generateId();
        this.storeId = storeId;
        this.filePath = filePath;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}