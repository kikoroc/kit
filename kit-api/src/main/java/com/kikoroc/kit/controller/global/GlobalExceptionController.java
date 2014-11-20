package com.kikoroc.kit.controller.global;

import com.kikoroc.kit.Const;
import com.kikoroc.kit.dto.HttpRet;
import com.kikoroc.kit.exception.IllegalParameterException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Project : kit
 * Package : com.kikoroc.kit.controller.global
 * Date : 11/19/14 2:05 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */

@ControllerAdvice
public class GlobalExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalParameterException.class)
    public @ResponseBody HttpRet handleIllegalParameterException(IllegalParameterException e){
        HttpRet ret = new HttpRet(e.getCode(),
                e.getMsg());
        return ret;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public @ResponseBody HttpRet handleAllException(Exception e){
        HttpRet ret = new HttpRet(Const.RetCode.SERVER_ERROR,
                e.getLocalizedMessage());
        return ret;
    }


}
