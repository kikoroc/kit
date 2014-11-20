package com.kikoroc.kit.controller.account;

import com.kikoroc.kit.Const;
import com.kikoroc.kit.dto.HttpRet;
import com.kikoroc.kit.exception.IllegalParameterException;
import com.kikoroc.kit.model.Account;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project : kit
 * Package : com.kikoroc.kit.controller.account
 * Date : 11/19/14 5:23 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
@RestController
@RequestMapping(value = "/api/v1")
public class AccountController {

    @RequestMapping(value = "/ex/illegal")
    public HttpRet test() throws IllegalParameterException {
        throw new IllegalParameterException("parameter illegal.");
    }

    @RequestMapping(value = "/ex/all")
    public HttpRet all() throws Exception {
        throw new Exception("unkown error.");
    }

    @RequestMapping(value = "/test")
    public HttpRet diviZero(){
        int i = 5 / 0;
        return new HttpRet(Const.RetCode.OK,String.valueOf(i));
    }

    @RequestMapping(value = "/hi/{user}")
    public HttpRet normal(@PathVariable String user){
        Account account = new Account();
        account.setName(user);
        HttpRet ret = new HttpRet(Const.RetCode.OK,"success",account);
        return ret;
    }

}
