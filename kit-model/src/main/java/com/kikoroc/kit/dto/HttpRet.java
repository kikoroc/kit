package com.kikoroc.kit.dto;

import java.io.Serializable;

/**
 * Project : kit
 * Package : com.kikoroc.kit.dto
 * Date : 11/19/14 2:16 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
public class HttpRet implements Serializable{
    private static final long serialVersionUID = 5403521792772111219L;

    private int code;

    private String msg;

    private Object data;

    public HttpRet(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HttpRet(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
