package com.kikoroc.kit.exception;

import com.kikoroc.kit.Const.RetCode;

/**
 * Project : kit
 * Package : com.kikoroc.kit.exception
 * Date : 11/19/14 4:10 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
public class IllegalParameterException extends BaseException{

    private static final long serialVersionUID = 5354197601482750431L;

    public IllegalParameterException(String message) {
        super(RetCode.PARAM_ILLEGAL,message);
    }

}
