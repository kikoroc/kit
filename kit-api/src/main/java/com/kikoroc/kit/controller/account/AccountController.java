package com.kikoroc.kit.controller.account;

import com.kikoroc.kit.Const;
import com.kikoroc.kit.dto.HttpRet;
import com.kikoroc.kit.exception.IllegalParameterException;
import com.kikoroc.kit.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.NestedServletException;

/**
 * Project : kit
 * Package : com.kikoroc.kit.controller.account
 * Date : 11/19/14 5:23 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
//@RestController
@Controller
@RequestMapping(value = "/api/v1")
public class AccountController {

    @RequestMapping(value = "/ex/illegal")
    public @ResponseBody HttpRet test() throws IllegalParameterException {
        throw new IllegalParameterException("parameter illegal.");
    }

    @RequestMapping(value = "/ex/all")
    public @ResponseBody HttpRet all() throws Exception {
        throw new Exception("unkown error.");
    }

    @RequestMapping(value = "/ex/not")
    public @ResponseBody HttpRet except() throws NestedServletException {
        throw new NestedServletException("can u init NestedServletException?");
    }

    @RequestMapping(value = "/test")
    public @ResponseBody HttpRet diviZero(){
        int i = 5 / 0;
        return new HttpRet(Const.RetCode.OK,String.valueOf(i));
    }

    @RequestMapping(value = "/hi/{user}")
    public @ResponseBody HttpRet normal(@PathVariable String user){
        Account account = new Account();
        account.setName(user);
        HttpRet ret = new HttpRet(Const.RetCode.OK,"success",account);
        return ret;
    }

}
