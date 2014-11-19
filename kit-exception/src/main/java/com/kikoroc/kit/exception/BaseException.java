package com.kikoroc.kit.exception;

/**
 * Project : kit
 * Package : com.kikoroc.kit.exception
 * Date : 11/19/14 3:53 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
public class BaseException extends Exception{
    private static final long serialVersionUID = 3385304351247889834L;

    private int code;

    private String msg;

    public BaseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
