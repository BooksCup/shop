package com.bc.goods.enums;

/**
 * 返回消息
 *
 * @author zhou
 */
public enum ResponseMsg {

    /**
     * 返回信息
     */
    ADD_SUCCESS("ADD_SUCCESS", "新增成功"),
    ADD_ERROR("ADD_ERROR", "新增失败"),

    UPDATE_SUCCESS("UPDATE_SUCCESS", "修改成功"),
    UPDATE_ERROR("UPDATE_ERROR", "修改失败"),

    DELETE_SUCCESS("DELETE_SUCCESS", "删除成功"),
    DELETE_ERROR("DELETE_ERROR", "删除失败"),
    ;

    ResponseMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}